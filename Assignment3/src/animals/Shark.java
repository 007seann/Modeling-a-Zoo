package animals;

import areas.*;

public class Shark extends Animal{

    private final String nickName;

    public Shark(String nickName) { this.nickName = nickName; }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Shark || animal instanceof Starfish;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Aquarium) {
            return true;
        }
        return false;
    }



}
