package areas;

import java.util.ArrayList;

public class Aquarium extends Area implements IArea{

    int id;
    String name;
    int number;
    ArrayList<IArea> adjacent;

    public Aquarium(String name) {
        super(name);
        number = 0;
    }

    public int getNumber() { return number;}


    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    /**
     * The maximum number of Aquarium is 3.
     * @return true for when the number of animal objects in Aquarium is greater than or equal to 3.
     * False for when Aquarium is less than 3.
     */
    @Override
    public boolean isFull() {
        if(getNumber() >= 3) {
            return true;
        }
        return false;
    }
}
