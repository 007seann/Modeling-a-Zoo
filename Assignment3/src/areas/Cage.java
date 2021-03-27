package areas;

import java.util.ArrayList;

public class Cage implements IArea{

    public static int id;
    String name;
    ArrayList<IArea> adjacent;
    //public int id;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(long lastID) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
}
