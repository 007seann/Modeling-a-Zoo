package zoo;

import animals.Animal;
import areas.Area;
import areas.IArea;
import dataStructures.ICashCount;

import java.util.ArrayList;

public class Zoo implements IZoo{

    static int lastID;
    ArrayList<Integer> areaIDs;
    ArrayList<String> areaNames;
    ArrayList<Area> areas;
    ArrayList<Animal> animals;
    int areaIndex;
    Area area;



    Zoo() {
        areaIDs = new ArrayList<>();
        areas = new ArrayList<>();
        animals = new ArrayList<>();
        lastID = 0;
        int code = 0;
        areaIndex = 0;
    }

    @Override
    public int addArea(IArea area) {

            // Create a new id by increasing the global/static id
            ++lastID;

            assert (area instanceof Area);
            Area areA = (Area) area;

            // Set id with it
            areA.setId(lastID);

            //append the area to the current container
            areas.add((Area) area);


        //return the current Id for the area
        return lastID;
    }

    @Override
    public void removeArea(int areaId) {

        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i) == getArea(areaId))
                //break;
                areas.remove(i);
                return;
        }

    }

    /**
     * Returns the area associated with the given ID.
     * @param areaId The ID of the area to be fetched.
     * @return The area corresponding to the given ID.
     */
    @Override
    public IArea getArea(int areaId) {

        /*
           for(IArea area : areas) {
     if ((Area area).getId() == areadId) {
         */

        for(Area area : areas) {
            if(area.getId() == areaId) {
                return area;
            }
        }
        /*
        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i).getId() == areaId)
               areaIndex = i;
        }
        return areas.get(areaIndex);

         */return null;
    }

    @Override
    public byte addAnimal(int areaId, Animal animal) {
        if(area.isHabitat(getArea(areaId))) {
            return Codes.NOT_A_HABITAT;
        }

        if(animal.canLiveIn(getArea(areaId))) {
            return Codes.WRONG_HABITAT;
        }

        if(animal.isFullHabitat(getArea(areaId))) {
            return Codes.HABITAT_FULL;
        }

        if(!animal.isCompatibleWithArea(getArea(areaId), animal)) {
            return Codes.INCOMPATIBLE_INHABITANTS;
        }

        animals.add(animal);
        return Codes.ANIMAL_ADDED;

    }

    /*
    public boolean checkHabitat(int areaId, Animal animal) {
        if(animal )
    }

     */
    @Override
    public void connectAreas(int fromAreaId, int toAreaId) {

    }

    @Override
    public boolean isPathAllowed(ArrayList<Integer> areaIds) {
        return false;
    }

    @Override
    public ArrayList<String> visit(ArrayList<Integer> areaIdsVisited) {
        return null;
    }

    @Override
    public ArrayList<Integer> findUnreachableAreas() {
        return null;
    }

    @Override
    public void setEntranceFee(int pounds, int pence) {

    }

    @Override
    public void setCashSupply(ICashCount coins) {

    }

    @Override
    public ICashCount getCashSupply() {
        return null;
    }

    @Override
    public ICashCount payEntranceFee(ICashCount cashInserted) {
        return null;
    }
}
