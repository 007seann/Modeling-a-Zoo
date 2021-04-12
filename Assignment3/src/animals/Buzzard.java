package animals;

import areas.*;


public class Buzzards extends Animal{

    private final String nickName;


    public Buzzards(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return animal instanceof Buzzards || animal instanceof Parrots;
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Cage) {
            return true;
        }
        return false;
    }




}
