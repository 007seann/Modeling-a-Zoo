package zoo;

import animals.Animal;
import areas.IArea;
import dataStructures.ICashCount;

import java.util.ArrayList;

public class Zoo implements IZoo{
    @Override
    public int addArea(IArea area) {
        return 0;
    }

    @Override
    public void removeArea(int areaId) {

    }

    @Override
    public IArea getArea(int areaId) {
        return null;
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
