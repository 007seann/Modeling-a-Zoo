package areas;

import animals.Animal;

import java.util.ArrayList;

public class Cage extends Area implements IArea {

    public Cage(int maximum) {
        super(maximum);
    }


}

 /*
    @Override
    public String getAnimalFromArea() {
        for(Animal list : listOfInhabitants) {
            System.out.println(list.getNickname());
        }
        return null;
    }

   // public int getNumber() { return number;}
     */
