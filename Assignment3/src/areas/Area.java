package areas;

import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {

    protected int id;
    //protected String name;
    protected int name;
    //List of next areas
    public ArrayList<Area> nextAreas;
    //List of prev areas
    public ArrayList<Area> prevAreas;
    public ArrayList<Animal> listOfInhabitants;
    int maximum;



    public Area(int maximum) {

        nextAreas = new ArrayList<>();
        prevAreas = new ArrayList<>();
        if (maximum != 0) {
            listOfInhabitants = new ArrayList<>();
            this.maximum = maximum;
        }
    }

    public Area() {
        this(0);
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

    public boolean IsCompatibleWithInhabitants(Animal animal) {
        if (isHabitat()) {
            for(Animal inhabit : listOfInhabitants) {
                if(!animal.isCompatibleWith(inhabit)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isHabitat() { return listOfInhabitants != null; }

    //public void setMaximum(int maximum) { this.maximum = maximum; }
    public int getMaximum() { return maximum; }

    public void addAnimalToArea(Animal animal) {
        if (isHabitat()) {
            listOfInhabitants.add(animal);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public ArrayList<Integer> getAdjacentAreas() {
        ArrayList<Integer> a = new ArrayList<>();
        for (Area nextArea : nextAreas) {
            a.add(nextArea.getId());
        }
        return a;
    }

    int getNumber() {
        return listOfInhabitants.size();
    }
    public boolean isFull() {
        return getNumber() >= getMaximum();
    }


    public ArrayList<String> getAnimalNames() {
        ArrayList<String> animalNames = new ArrayList<>();
        for (Animal animal : listOfInhabitants) {
            animalNames.add(animal.getNickname());
        }
        return animalNames;
    }

    //public abstract String getAnimalFromArea();
    int getName() {
        return name;
    }

    void setName(int newName) {
        name = newName;
    }

    void addAdjacent(Area area) {
        nextAreas.add(area);
    }





}
