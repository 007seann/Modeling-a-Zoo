public class NumberHolder {

    public int anInt;
    public float aFloat;

    NumberHolder() {
        anInt = 0;
        aFloat = 0;
    }

}

class NumberHolderDisplay {
    public static void main(String[] args) {
        NumberHolder aNumberHolder = new NumberHolder();
        aNumberHolder.anInt = 3;
        aNumberHolder.aFloat = 0.2f;
        System.out.println(aNumberHolder.anInt);
        System.out.println(aNumberHolder.aFloat);
    }
}
