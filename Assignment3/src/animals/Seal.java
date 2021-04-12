package animals;

import areas.*;

public class Seals extends Animal{

    private final String nickName;

    public Seals(String nickName) {
        this.nickName = nickName;

    }


    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Seals || animal instanceof Starfish;
    }

    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Aquarium) {
            return true;
        }
        return false;
    }


}
