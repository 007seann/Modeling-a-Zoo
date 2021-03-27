package zoo;

import animals.Animal;
import areas.IArea;
import dataStructures.ICashCount;

import java.util.ArrayList;

public class Zoo implements IZoo{

    static long lastID;
    //private int areaId;
    ArrayList<Integer> areaIDs;
    ArrayList<String> areaNames;
    ArrayList<IArea> areas;
    ArrayList<Animal> animals;

    Zoo() {
        areaIDs = new ArrayList<>();
        lastID = 0;
    }

    @Override
    public int addArea(IArea area) {
        area = null;
        if(area != null) {
            // Create a new id by increasing the global/static id
            ++lastID;

            // Set id with it
            area.setId(lastID);

            //append the area to the current container

            areas.add(area);
        }

        //return the current Id for the area
        return (int) lastID;
    }

    @Override
    public void removeArea(int areaId) {
        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i).getId() == areaId)
                areas.remove(i);
                return;
        }

    }

    @Override
    public IArea getArea(int areaId) {
        IArea area = null;
        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i).getId() == areaId)
                area = areas.get(i);
        }
        return area;
    }

    @Override
    public byte addAnimal(int areaId, Animal animal) {
        return 0;
    }

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
