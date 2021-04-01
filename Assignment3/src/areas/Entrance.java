package areas;

import animals.Animal;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id;
    String name;
    ArrayList<IArea> adjacent;

    public Entrance(String name) {
        super(name);
        id = 0;
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
