package zoo;

import areas.*;

public class Main {

    public static void main(String[] args) {

        Zoo z = new Zoo();
        PicnicArea a1 = new PicnicArea();
        int p1 = z.addArea(a1);

        PicnicArea a2 = new PicnicArea();
        int p2 = z.addArea(a2);

        Aquarium a3 = new Aquarium();
        int aq1 = z.addArea(a3);

        Cage a4 = new Cage();
        int c1 = z.addArea(a4);

        Enclosure a5 = new Enclosure();
        int e1 = z.addArea(a5);

        Entrance a6 = new Entrance();
        int en1 = z.addArea(a6);


    }
}
