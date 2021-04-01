package areas;

import animals.Animal;

import java.util.ArrayList;

public class PicnicArea extends Area implements IArea {

    int id;
    String name;
    ArrayList<IArea> adjacent;

    public PicnicArea(String name) {
        super(name);
        habitat = false;
    }

    @Override
    public void addAnimal(Animal animal) {

    }

    @Override
    public void getAnimal() {}


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
