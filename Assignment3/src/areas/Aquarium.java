package areas;

import animals.Animal;

import java.util.ArrayList;

public class Aquarium extends Area implements IArea{

    int id;
    String name;
    ArrayList<IArea> adjacent;



    public Aquarium(int maximum) {
        super(maximum);
       // number = 0;
        habitat = true;
        listOfInhabitants = new ArrayList<>();
        adjacent = new ArrayList<>();
        this.maximum = maximum;

    }


    @Override
    public void addAnimalToArea(Animal animal) {
         listOfInhabitants.add(animal);
        // ++number;
    }






    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
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

    //@Override
    //    public String getAnimalFromArea() {
    //        for(Animal list : listOfInhabitants) {
    //            System.out.println(list.getNickname());
    //        }
    //        return null;
    //    }
}
