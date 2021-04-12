package animals;

import areas.*;

public class Parrots extends Animal{

    private final String nickName;


    public Parrots(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Parrots || animal instanceof Buzzards;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Cage) {
            return true;
        }
        return false;
    }



}
