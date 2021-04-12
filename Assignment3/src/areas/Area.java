package areas;

import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {

    boolean habitat;
    protected int id;
    //protected String name;
    protected int name;
    //List of next areas
    public ArrayList<Area> nextAreas;
    public ArrayList<Integer> adjacentAreas;
    //List of prev areas
    public ArrayList<Area> prevAreas;
    ArrayList<Animal> listOfInhabitants;
    int maximum;



    public Area(int name) {
        this.name = name;
        listOfInhabitants = new ArrayList<>();
        nextAreas = new ArrayList<>();
        prevAreas = new ArrayList<>();

    }

    public Area() {

    }

    public void print() {
        System.out.println("Area Id: " + id);
        System.out.print("\t next: ");
        for (Area n : nextAreas) {
            System.out.print(n.id +" ");
        }
        System.out.println();
    }

    public void printPrev() {
        System.out.println("Area Id: " + id);
        System.out.print("\t prev: ");
        for (Area n : prevAreas) {
            System.out.print(n.id +" ");
        }
        System.out.println();
    }
    public boolean isHabitat() { return habitat; }

    public void setMaximum(int maximum) { this.maximum = maximum; }
    public int getMaximum() { return maximum; }


    public abstract void addAnimalToArea(Animal animal);

    public abstract String getAnimalFromArea();

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    int getName() {
        return name;
    }

    void setName(int newName) {
        name = newName;
    }

    void addAdjacent(Area area) {
        nextAreas.add(area);
    }

    public ArrayList<Integer> getAdjacentAreas() {
        for (Area nextArea : nextAreas) {
            adjacentAreas.add(nextArea.getId());
        }
        return adjacentAreas;
    }

    //public abstract void relationship(Area area);


    public abstract boolean isFull();



    public abstract boolean IsCompatibleWithInhabitants(Animal animal);


}
