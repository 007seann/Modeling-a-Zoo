package areas;

import animals.Animal;

import java.util.ArrayList;

public class PicnicArea extends Area implements IArea {

    public PicnicArea() {
        super();
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
