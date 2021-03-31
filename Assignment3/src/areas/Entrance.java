package areas;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id;
    String name;
    ArrayList<IArea> adjacent;

    public Entrance(String name) {
        super(name);
        id = 0;
    }

    //public int getId() { return id; }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
