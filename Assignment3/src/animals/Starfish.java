package animals;

import areas.*;

public class Starfish extends Animal{

    private final String nickName;

    public Starfish(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Sharks || animal instanceof Starfish || animal instanceof Seals;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Starfish) {
            return true;
        }
        return false;
    }



}
