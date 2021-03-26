package animals;

public class Seals extends Animal{

    private final String nickName;

    public Seals(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal.equals(Animal.sharks)) {
            return false;
        }
        return (animal.equals(seals) || animal.equals(starfish));
    }

}
