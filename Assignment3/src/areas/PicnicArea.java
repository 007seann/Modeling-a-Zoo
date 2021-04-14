package areas;

import animals.Animal;

import java.util.ArrayList;

public class PicnicArea extends Area implements IArea {

    int id;
    String name;
    ArrayList<IArea> adjacent;

    public PicnicArea() {
        super();
        habitat = false;
        adjacent = new ArrayList<>();
    }

    @Override
    public void addAnimalToArea(Animal animal) {

    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean IsCompatibleWithInhabitants(Animal animal) {
        return false;
    }
}
/*

    @Override
    public String getAnimalFromArea() {
        return null;
    }

 */
