package animals;

import areas.*;

public class Parrot extends Animal{

    private final String nickName;


    public Parrot(String nickName) { this.nickName = nickName; }

    @Override
    public String getNickname() {
        return nickName;
    }

    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Parrot;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Cage) {
            return true;
        }
        return false;
    }



}
