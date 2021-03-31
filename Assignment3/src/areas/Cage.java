package areas;

import java.util.ArrayList;

public class Cage extends Area implements IArea {

    int id;
    String name;
    int number;
    ArrayList<IArea> adjacent;
    //public int id;

    public Cage(String name) {
        super(name);
        number = 0;
    }

    public int getNumber() { return number;}



    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    /**
     * The maximum number of Cage is 3.
     * @return true for when the number of animal objects in Cage is greater than or equal to 3.
     * False for when Cage is less than 3.
     */
    @Override
    public boolean isFull() {
        if(getNumber() >= 3) {
            return true;
        }
        return false;
    }
}
