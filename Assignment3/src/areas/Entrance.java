package areas;

import java.util.ArrayList;

public class Entrance implements IArea{

    int id = 0;
    String name;
    ArrayList<IArea> adjacent;

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
