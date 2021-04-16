package animals;

import areas.*;

public class Lion extends Animal {

    private final String nickName;

    public Lion(String nickName) { this.nickName = nickName; }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Lion;
    }

    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Enclosure) {
            return true;
        }
        return false;
    }



}
