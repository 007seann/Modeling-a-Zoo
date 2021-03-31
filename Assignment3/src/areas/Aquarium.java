package areas;

import java.util.ArrayList;

public class Aquarium extends Area implements IArea{

    public static Aquarium aquarium;
    int id;
    String name;
    int maximum; // The maximum number of aquarium is 3.
    ArrayList<IArea> adjacent;

    public Aquarium(String name) {
        super(name);
        maximum = 0;
    }

    public int getMaximum() { return maximum;}


    public int getId() {
        return id;
    }


    public void setId(long lastID) {

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
