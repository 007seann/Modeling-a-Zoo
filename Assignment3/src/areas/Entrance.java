package areas;

import animals.Animal;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id;
    String name;
    ArrayList<Area> adjacent;
    //PicnicArea picnicArea;

    public Entrance(String name) {
        super(name);
        id = 0;
        habitat = false;
        //picnicArea = new PicnicArea(name);
        //adjacent.add(picnicArea);
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
    public void relationship(Area area) {

        while(area instanceof PicnicArea) {

        }
        adjacent.add(picnicArea);
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
