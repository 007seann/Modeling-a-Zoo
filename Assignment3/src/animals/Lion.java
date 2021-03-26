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
        if (animal.equals(Animal.zebra) || animal.equals(gazelles)) {
            return false;
        }
        return (animal.equals(lion));
    }

}
