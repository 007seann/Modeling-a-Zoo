package areas;

import java.util.ArrayList;

public class Enclosure extends Area implements IArea {

    public static Enclosure enclosure;
    int id;
    String name;
    int maximum;
    ArrayList<IArea> adjacent;

    public Enclosure(String name) {
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
