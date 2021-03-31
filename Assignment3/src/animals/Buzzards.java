package animals;

import areas.*;


public class Buzzards extends Animal{

    private final String nickName;


    public Buzzards(String nickName) {
        this.nickName = nickName;
        Aquarium aquarium;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return false;
    }

    @Override
    public boolean isNotHabitat(IArea area) {
        if(area instanceof PicnicArea || area instanceof Entrance) {
            return true;
        }
        return false;
    }

    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Cage) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isWrongHabitat(IArea area) {
        if(area instanceof Aquarium || area instanceof Enclosure) {
            return true;
        }
        return false;
    }


    /**
     * @param area which refers to the habitat with its current occupants.
     * @param animal which refers to the animal occupant in the habitat.
     */
    @Override
    public boolean isCompatibleWithArea(IArea area, Animal animal) {
        if(area instanceof Cage && isCompatibleWith(animal)) {
            return true;
        }
        return false;
    }





}
