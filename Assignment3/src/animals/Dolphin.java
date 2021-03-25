package animals;

public class Dolphin extends Animal{

    private final String nickName;

    public Dolphin(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal.equals(Animal.zebra) || animal.equals(lion) || animal.equals(chickens)) {
            return false;
        }
        return (animal.equals(dolphin));
    }

}
