package areas;

import animals.Animal;

import java.util.ArrayList;

public class Enclosure extends Area implements IArea {

    public Enclosure(int maximum) {
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

 */

