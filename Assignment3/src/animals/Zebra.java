package animals;

import areas.*;

public class Zebra extends Animal {

    private final String nickName;

    public Zebra(String nickName) {
        this.nickName = nickName;

    }
    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Zebra || animal instanceof Gazelle;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Enclosure) {
            return true;
        }
        return false;
    }


}
