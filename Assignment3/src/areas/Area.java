package areas;

import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {

    protected int id;
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


    public boolean IsCompatibleWithInhabitants(Animal animal) {
        if (isHabitat()) {
            return false;
        }
        for(Animal inhabit : listOfInhabitants) {
           if(!animal.isCompatibleWith(inhabit)) {
                  return false;
                }
            }
        return true;
    }

    public boolean isHabitat() { return listOfInhabitants != null; }

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

    public boolean isFull() {
        return listOfInhabitants.size() >= maximum;
    }

    public ArrayList<String> getAnimalNames() {
        ArrayList<String> animalNames = new ArrayList<>();
        if (isHabitat()) {
            for (Animal animal : listOfInhabitants) {
                animalNames.add(animal.getNickname());
            }
        }
        return animalNames;
    }

    //For debugging
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
}
