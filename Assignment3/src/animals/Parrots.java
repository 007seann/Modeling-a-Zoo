package animals;

public class Parrots extends Animal{

    private final String nickName;


    public Parrots(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return false;

    }

}
