package animals;

public class Lion extends Animal {

    private final String nickName;

    public Lion(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal.equals(Animal.zebra) || animal.equals(dolphin) || animal.equals(chickens)) {
            return false;
        }
        return (animal.equals(lion));
    }

}
