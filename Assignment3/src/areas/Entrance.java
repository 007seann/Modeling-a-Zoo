package areas;

import animals.Animal;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id;
    String name;
    ArrayList<Area> adjacent;
    //PicnicArea picnicArea;

    public Entrance() {
        super();
        id = 0;
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