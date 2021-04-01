package areas;

import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {

    boolean habitat;
    int id;
    String name;
    ArrayList<Integer> adjacentAreas;
    ArrayList<Animal> listOfInhabitants;

    public Area(String name) {
        this.name = name;
        listOfInhabitants = new ArrayList<>();
    }

    public boolean isHabitat() { return habitat; }

    public abstract void addAnimal(Animal animal);

    public abstract void getAnimal();

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

    /*
    public boolean isHabitat(IArea area) {
        if(area instanceof PicnicArea || area instanceof Entrance) {
            return false;
        }
        return true;
    }

     */

    public abstract boolean isFull();


    public abstract boolean IsCompatibleWithInhabitants(Animal animal);
}
