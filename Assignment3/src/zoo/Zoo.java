package zoo;

import animals.Animal;
import areas.Area;
import areas.Entrance;
import areas.IArea;
import dataStructures.CashCount;
import dataStructures.ICashCount;

import java.util.ArrayList;

public class Zoo implements IZoo{

    static int lastID;
    static final int entranceID = 0;
    ArrayList<Integer> areaIDs;
    ArrayList<Area> areas;
    ArrayList<Animal> animals;
    ArrayList<String> allNameLists;

    CashCount cashCount; // total money Zoo has
    int entranceFee; // Entrance fee in pence




    public Zoo() {
        //areaIDs = new ArrayList<>();
        areas = new ArrayList<>();
        animals = new ArrayList<>();
        allNameLists = new ArrayList<>();
        lastID = 0;
        cashCount = new CashCount();
        entranceFee = 0;
        addArea(new Entrance());


    }

    @Override
    public int addArea(IArea area) {


            if (area instanceof Entrance) {
                Area areaObject = (Area) area;
                areaObject.setId(entranceID);
                if(getArea(0) != null)
                    removeArea(0);
                areas.add((Area) area);
                return entranceID;
            }

            // Create a new id by increasing the global/static id
            ++lastID;

            assert (area instanceof Area);
            Area areaObject = (Area) area;

            // Set id with it
            areaObject.setId(lastID);

            //append the area to the current container
            areas.add((Area) area);

        //return the current Id for the area
        return lastID;

    }


    @Override
    public void removeArea(int areaId) {

        Area area = (Area) getArea(areaId);
        if (area == null || area instanceof Entrance) { return; }

        // Remove it from any nextAreas, if present.
        for (Area prev : areas) {
            prev.nextAreas.remove(area);
        }

        //Remove it from areas
        areas.remove(area);

    }
/*
        //Remove it from its prev's next
        for(Area prev : area.prevAreas) {
            if(areas.contains(prev)) {
                prev.nextAreas.remove(area);
            }
        }

        //Remove it from its next's prev
        for(Area next : area.nextAreas) {
            if(areas.contains(next)) {
                next.prevAreas.remove(area);
            }
        }

         */

    /**
     * Returns the area associated with the given ID.
     * @param areaId The ID of the area to be fetched.
     * @return The area corresponding to the given ID.
     */
    @Override
    public IArea getArea(int areaId) {


        for(Area area : areas) {
            if(area == null) { return null; }
            if(area.getId() == areaId) {
                return area;
            }
        }
      return null;
    }


    @Override
    public byte addAnimal(int areaId, Animal animal) {
        Area area = (Area) getArea(areaId);
        if( area != null ) {
            if(!area.isHabitat()) {
                System.out.println("Not a habitat: ");
                return Codes.NOT_A_HABITAT;
            }

            if(!animal.canLiveIn(getArea(areaId))) {
                System.out.println("Wrong a habitat: " );
                return Codes.WRONG_HABITAT;
            }

            if(area.isFull()) {
                System.out.println("Habitat is full: " );
                return Codes.HABITAT_FULL;
            }

            if(!area.IsCompatibleWithInhabitants(animal)) {
                System.out.println("Incompatible inhabitant: ");
                return Codes.INCOMPATIBLE_INHABITANTS;
            }
        }

        for(Area areaElements : areas) {
            if(areaElements.getId() == areaId) {
                assert area != null;
                area.addAnimalToArea(animal);
            }
        }
        animals.add(animal);
        System.out.println("Animal is added");
        return Codes.ANIMAL_ADDED;

    }

    @Override
    public void connectAreas(int fromAreaId, int toAreaId) {
        //Get fromArea
        Area fromArea = (Area) getArea(fromAreaId);

        //Get Area
        Area toArea = (Area) getArea(toAreaId);

        if (fromArea == null || toArea == null)
            return;

        for(Integer areaId : fromArea.getAdjacentAreas()) {
            if(toAreaId == areaId) {
                return;
            }
        }

        //Splice them
        if (!fromArea.nextAreas.contains(toArea))
            fromArea.nextAreas.add(toArea);
    }



/*
    {
       //Get fromArea
        Area fromArea = (Area) getArea(fromAreaId);
        //Get Area
        Area toArea = (Area) getArea(toAreaId);
        for(Integer areaId : fromArea.getAdjacentAreas()) {
            if(toAreaId == areaId) {
                fromArea.nextAreas.add(toArea);
            }
        }

 */

        /*
        if (fromArea == null || toArea == null) {
            return;
        }

         */
        /*
        //Splice them
        if(!fromArea.nextAreas.contains(toArea)) {
            fromArea.nextAreas.add(toArea);
        }


         */

        /*
        if(!toArea.prevAreas.contains(fromArea)){
            toArea.prevAreas.add(fromArea);

        }

         */



    @Override
    public boolean isPathAllowed(ArrayList<Integer> areaIds) {
        // Treat empty paths as passing case.
        if (areaIds == null || areaIds.size() == 0)
            return true;

        // Initialize prev area.
        int prevId = areaIds.get(0);
        if (!hasArea(prevId))
            return false;
        Area prev = (Area) getArea(prevId);

        // visited ArrayList
        ArrayList<Area> visited = new ArrayList<>();
        visited.add(prev);

        for (int i = 1; i < areas.size(); i++) {
            // Get curr area.
            int currId = areaIds.get(i);
            if (!hasArea(currId))
                return false;
            Area curr = (Area) getArea(currId);

            // Check if curr is in the prev's next.
            if (!prev.nextAreas.contains(curr))
                return false;
            // Update prev
            prev = curr;
        }
        return true;
    }

    boolean hasArea(int areaId) {
        return getArea(areaId) != null;
    }

    @Override
    public ArrayList<String> visit(ArrayList<Integer> areaIdsVisited) {
        ArrayList<String> animalNames = new ArrayList<>();

        if(!isPathAllowed(areaIdsVisited)) {
            return null;
        }

        for (Integer areaId : areaIdsVisited) {
            Area area = (Area) getArea(areaId);
            if (area.isHabitat()) {
                animalNames.addAll(area.getAnimalNames());
            }
        }
        return animalNames;
    }


    @Override
    public ArrayList<Integer> findUnreachableAreas() {
        // Copy all areaID
        ArrayList<Integer> unvisited = new ArrayList<>();
        for (Area a : areas) {
            unvisited.add(a.getId());
        }

        // Get entry
        Area e = (Area) getArea(0);
        visit(e,unvisited);

        return unvisited;
    }

    void visit(Area a, ArrayList<Integer> unvisited) {
        // if a (area) does not exist in unvisited (it's already visited), just return
        if(unvisited == null || a == null) { return; }
        if(!unvisited.contains(a.getId()))
            return;

        //Mark it's visited -- remove it from unvisited
        unvisited.remove(Integer.valueOf(a.getId()));

        //Visit its next area recursively.
        for (Area n : a.nextAreas){
            visit(n, unvisited);
        }
    }



      /*
        Area area = (Area) getArea(areaIDs.get(0));
        for(int i=0; i<areaIDs.size(); i++) {
            for(int j=0; j<area.nextAreas.size(); j++) {
                if(!areaIDs.get(i).equals(area.nextAreas.get(j))) {
                    unReachableAreaIDs.add(i);
                }
            }
        }
        return unReachableAreaIDs;
    }

       */

    @Override
    public void setEntranceFee(int pounds, int pence) {
        entranceFee = pounds * 100 + pence;
    }

    @Override
    public void setCashSupply(ICashCount coins) {
        this.cashCount = (CashCount) coins;
    }

    @Override
    public ICashCount getCashSupply() {
        return cashCount;
    }

    @Override
    public ICashCount payEntranceFee(ICashCount cashInserted) {
        CashCount moneyInserted = (CashCount) cashInserted;

        // Corner cases
        // Case 1 when cashInserted is smaller than entranceFee
        if(moneyInserted.getValue() < entranceFee) {
            return moneyInserted;
        }

        // cashCount += cashInserted;
        cashCount = CashCount.add(cashCount, moneyInserted);

        // changeValue(pence) = cashInserted(CashCount) - entranceFee(pence)
        int changeValue = CashCount.subtract(moneyInserted, entranceFee);

        // Update cashCount by subtracting changeValue from it.
        // Return change converted in CashCount for the given changeValue.
        CashCount change = cashCount.pay(changeValue);

        // Case 2 When we can't pay the change -- the converted CashCount is different than changeValue.
        if (change.getValue() != changeValue) {
            // restore the original money to cashCount that Zoo has.
            cashCount = CashCount.add(cashCount, change);
            cashCount = CashCount.sub(cashCount, moneyInserted);

            // return the inserted money
            return moneyInserted;
        }

        // Now all meet. Just return the change.
        return change;

        // Case 3
        // Case 4
        // else부분이 20파운드 11장을 내야하는데 10장있을경우 1장을 다음 화폐 단위로 넘겨주는 코드

    }

}

/*
    @Override
    public boolean isPathAllowed(ArrayList<Integer> areaIds) {

        if(areaIds == null) {
            return false;
        }

        for (int i=0; i<areas.size(); i++){
            Area areaInput = (Area) getArea(areaIds.get(i));
            if(areaInput == null) { return false; }
            if (areas.get(i).nextAreas != areaInput.nextAreas) {
                if(areas.get(i).nextAreas == null || areaInput.nextAreas == null) { return false; }
                return false;
            }
        }
        return true;
    }

    @Override
    public ArrayList<String> visit(ArrayList<Integer> areaIdsVisited) {
        if (!isPathAllowed(areaIdsVisited)) {
            return null;
        }

        for (Integer areaId : areaIdsVisited) {
            Area area = (Area) getArea(areaId);
            if(area == null || area.getAnimalFromArea() == null) {
                return null;
            }
            allNameLists.add(area.getAnimalFromArea());
        }
        return allNameLists;
    }
 */

/*
    CashCount payEntranceFee(CashCount cashInserted) {
        //totalMoney += cashInserted;
        cashCount = CashCount.add(cashCount, cashInserted);

        //return cashInserted - entranceFee;
        double returnValue = CashCount.subtract(cashInserted, entranceFee);

        //Update totalMoney by subtracting returnValue;
        return cashCount.pay(returnValue);
    }


 */
