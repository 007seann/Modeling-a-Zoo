package areas;

import java.util.ArrayList;

public class Entrance extends Area implements IArea {

    int id = 0;
    String name;
    ArrayList<IArea> adjacent;

    public Entrance(String name) {
        super(name);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {

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
