package areas;

import animals.Animal;

import java.util.ArrayList;

public class Aquarium extends Area implements IArea{

    int id;
    String name;
    int number; // This number refer to the current number of objects in Aquarium.
    ArrayList<IArea> adjacent;


    public Aquarium(String name) {
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

    public int getNumber() { return number;}


    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }

    /**
     * The maximum number of Aquarium is 3.
     * @return true for when the number of animal objects in Aquarium is greater than or equal to 3.
     * False for when Aquarium is less than 3.
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
