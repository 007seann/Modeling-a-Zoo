package animals;

import areas.*;


public class Buzzard extends Animal{

    private final String nickName;


    public Buzzard(String nickName) { this.nickName = nickName; }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return (animal instanceof Buzzard);
    }


    @Override
    public boolean canLiveIn(IArea area) {
        if(area instanceof Cage) {
            return true;
        }
        return false;
    }




}
