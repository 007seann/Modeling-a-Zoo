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

        return (animal.equals(sharks) || animal.equals(starfish) || animal.equals(seals));
    }

}
