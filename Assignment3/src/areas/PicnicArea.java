package areas;

import java.util.ArrayList;

public class PicnicArea extends Area implements IArea {

    int id;
    String name;
    ArrayList<IArea> adjacent;

    public PicnicArea(String name) {
        super(name);
    }


    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
