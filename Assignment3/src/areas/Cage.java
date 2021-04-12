package areas;

import animals.Animal;

import java.util.ArrayList;

public class Cage extends Area implements IArea {

    int id;
    String name;
    int number; // This number refer to the current number of objects in Cage.
    ArrayList<IArea> adjacent;



    public Cage(int name) {
        super(name);
        number = 0;
        habitat = true;
        listOfInhabitants = new ArrayList<>();
        adjacent = new ArrayList<>();
    }

    @Override
    public void addAnimalToArea(Animal animal) {
        listOfInhabitants.add(animal);
        ++number;
    }

    @Override
    public String getAnimalFromArea() {
        for(Animal list : listOfInhabitants) {
            System.out.println(list.getNickname());
        }
        return null;
    }

    public int getNumber() { return number;}



    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    /*
    @Override
    public void relationship() {
        if (!adjacent.add(enclosure)) {
            adjacent.add(cage);
        }

    }

     */

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

    @Override
    public boolean IsCompatibleWithInhabitants(Animal animal) {
        for(Animal list : listOfInhabitants) {
            if(!animal.isCompatibleWith(list)) {
                return false;
            }
        }
        return true;
    }
}
