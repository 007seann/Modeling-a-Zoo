package animals;

import areas.*;

public class Seal extends Animal{

    private final String nickName;

    public Seal(String nickName) { this.nickName = nickName; }


    @Override
    public String getNickname() { return nickName; }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Seal || animal instanceof Starfish;
    }

    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Aquarium) {
            return true;
        }
        return false;
    }


}
