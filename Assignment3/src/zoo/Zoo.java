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
    ArrayList<Area> areas;

    CashCount cashCount; // total money Zoo has
    int entranceFee; // Entrance fee in pence


    public Zoo() {
        areas = new ArrayList<>();
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

        for (int i = 1; i < areaIds.size(); i++) {
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

        // Case 1 when the inserted money is exactly the same with entranceFee, then no change.

        // Case 2 when cashInserted is smaller than entranceFee
        if(moneyInserted.getValue() < entranceFee) {
            return moneyInserted;
        }

        // cashCount += cashInserted;
        cashCount = CashCount.add(cashCount, moneyInserted);

        // changeValue(pence) = cashInserted(CashCount) - entranceFee(pence)
        int changeValue = CashCount.subtract(moneyInserted, entranceFee);

        // Case 3 when the inserted money is too much and the machine is able to give exact change,
        // then the machine much do so.
        // Update cashCount by subtracting changeValue from it.
        // Return change converted in CashCount for the given changeValue.
        CashCount change = cashCount.pay(changeValue);

        // Case 4 When we can't pay the change -- the converted CashCount is different with changeValue.
        if (change.getValue() != changeValue) {
            // restore the original money to cashCount that Zoo has.
            cashCount = CashCount.add(cashCount, change);
            cashCount = CashCount.sub(cashCount, moneyInserted);

            // return the inserted money
            return moneyInserted;
        }

        // Now all meet. Just return the change.
        return change;

    }

}

