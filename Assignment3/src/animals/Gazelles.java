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
        return animal instanceof Zebra || animal instanceof Gazelles;
    }



    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Enclosure) {
            return true;
        }
        return false;
    }



}
