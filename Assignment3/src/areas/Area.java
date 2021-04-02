package areas;

import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {

    boolean habitat;
    protected int id;
    protected String name;
    public ArrayList<Integer> nextAreas;
    ArrayList<Animal> listOfInhabitants;

    public Area(String name) {
        this.name = name;
        listOfInhabitants = new ArrayList<>();
        nextAreas = new ArrayList<>();
    }

    public boolean isHabitat() { return habitat; }

    public abstract void addAnimalToArea(Animal animal);

    public abstract String getAnimalFromArea();

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
        nextAreas.add(area.getId());
    }

    public ArrayList<Integer> getAdjacentAreas() {
        return nextAreas;
    }

    //public abstract void relationship(Area area);


    public abstract boolean isFull();


    public abstract boolean IsCompatibleWithInhabitants(Animal animal);
}
