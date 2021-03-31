package areas;

import java.util.ArrayList;

public class Cage extends Area implements IArea {

    public static Cage cage;
    int id;
    String name;
    int maximum;

    ArrayList<IArea> adjacent;
    //public int id;

    public Cage(String name) {
        super(name);
        maximum = 3;
    }

    public int getMaximum() { return maximum;}



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
