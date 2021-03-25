package animals;

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
        if (animal.equals(Animal.lion) || animal.equals(dolphin) || animal.equals(chickens)) {
            return false;
        }
        return (animal.equals(zebra));
    }

}
