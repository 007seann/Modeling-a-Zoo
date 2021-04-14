package areas;

import animals.Animal;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id;

    public Entrance() {
        super();
        id = 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }


}
/*
    @Override
    public String getAnimalFromArea() {
        return null;
    }

 */