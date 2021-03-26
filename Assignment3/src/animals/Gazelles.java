package animals;

public class Gazelles extends Animal {

    private final String nickName;

    public Gazelles(String nickName) {
        this.nickName = nickName;

    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if (animal.equals(Animal.zebra) || animal.equals(sharks) || animal.equals(buzzards)) {
            return false;
        }
        return (animal.equals(lion));
    }

}
