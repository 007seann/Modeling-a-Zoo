package animals;

import areas.*;

public class Gazelles extends Animal {

    private final String nickName;

    public Gazelles(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal instanceof Lion) {
            return false;
        }
        return (animal instanceof Zebra || animal instanceof Gazelles);
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
        if(area instanceof Enclosure) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isWrongHabitat(IArea area) {
        if(area instanceof Aquarium || area instanceof Cage) {
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
        if(area instanceof Enclosure && isCompatibleWith(animal)) {
            return true;
        }
        return false;
    }

}
