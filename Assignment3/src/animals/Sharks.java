package animals;

public class Sharks extends Animal{

    private final String nickName;

    public Sharks(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal.equals(Animal.seals)) {
            return false;
        }
        return (animal.equals(sharks) || animal.equals(starfish));
    }

}
