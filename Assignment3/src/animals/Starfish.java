package animals;

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
        if (animal.equals(Animal.zebra) || animal.equals(lion) || animal.equals(buzzards)) {
            return false;
        }
        return (animal.equals(sharks));
    }

}
