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
        adjacent = new ArrayList<>();
    }

    @Override
    public void addAnimalToArea(Animal animal) {

    }

    @Override
    public String getAnimalFromArea() {
        return null;
    }


    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
/*
    @Override
    public void relationship() {
        if (!adjacent.add(picnicArea)) {
            adjacent.add(aquarium);
        }
    }


 */
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean IsCompatibleWithInhabitants(Animal animal) {
        return false;
    }
}
