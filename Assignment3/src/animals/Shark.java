package animals;

import areas.*;

public class Sharks extends Animal{

    private final String nickName;

    public Sharks(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Sharks || animal instanceof Starfish;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Sharks) {
            return true;
        }
        return false;
    }



}
