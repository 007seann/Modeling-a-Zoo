package areas;

import animals.Animal;

import java.util.ArrayList;

public class Enclosure extends Area implements IArea {

    int id;
    String name;
    int number; // This number refer to the current number of objects in Enclosure.
    ArrayList<IArea> adjacent;

    public Enclosure(String name) {
        super(name);
        number = 0;
        habitat = true;
        listOfInhabitants = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        listOfInhabitants.add(animal);
        ++number;
    }

    @Override
    public void getAnimal() {
        for(Animal list : listOfInhabitants) {
            System.out.println(list.getNickname());
        }
    }

    public int getNumber() {
        return number;
    }



    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    /**
     * The maximum number of Enclosure is 3.
     * @return true for when the number of animal objects in Enclosure is greater than or equal to 3.
     * False for when Enclosure is less than 3.
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
