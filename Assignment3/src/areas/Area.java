package areas;

import java.util.ArrayList;

public abstract class Area implements IArea {

    int id;
    String name;
    ArrayList<Integer> adjacentAreas;

    public Area(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    void addAdjacent(Area area) {
        adjacentAreas.add(area.getId());
    }

    public ArrayList<Integer> getAdjacentAreas() {
        return adjacentAreas;
    }

    public boolean isHabitat(IArea area) {
        if(area instanceof PicnicArea || area instanceof Entrance) {
            return false;
        }
        return true;
    }

    public abstract boolean isFull();


}
