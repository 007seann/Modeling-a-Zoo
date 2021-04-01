package zoo;

import animals.*;
import areas.*;

public class Main {

    public static void main(String[] args) {

        Zoo z = new Zoo();

        Entrance a6 = new Entrance("WelcomeWorld");
        int en1 = z.addArea(a6);
        System.out.println(en1);
        System.out.println(z.getArea(en1));
        System.out.println();

        PicnicArea a1 = new PicnicArea("Meadow");
        int p1 = z.addArea(a1);
        System.out.println(p1);
        System.out.println(z.getArea(p1));

        PicnicArea a2 = new PicnicArea("Heaven");
        int p2 = z.addArea(a2);
        System.out.println(p2);
        System.out.println(z.getArea(p2));
        System.out.println();



        Aquarium a3 = new Aquarium("OceanWorld");
        Aquarium b3 = new Aquarium("OceanWorld");
        Seals s1 = new Seals("Miki");
        Seals s2 = new Seals("Maka");
        Seals s3 = new Seals("MakaBro");
        int aq1 = z.addArea(a3);
        int aq2 = z.addArea(b3);
        System.out.println(aq1);
        System.out.println(z.getArea(aq1));
        System.out.println(aq2);
        System.out.println(z.getArea(aq2));
        System.out.println();
        System.out.println(z.addAnimal(aq1, s1));
        System.out.println(z.addAnimal(aq1, s2));
        System.out.println(z.addAnimal(aq1, s3));
        System.out.println();
        System.out.println(z.addAnimal(p2, s2));
        //System.out.println(z.addAnimal());
        System.out.println();
        a3.getAnimal();
        b3.getAnimal();
       // System.out.println(z.addAnimal(p2, s2));
        //System.out.println(z.animals.get(0).getNickname());
        //System.out.println(s1.isCompatibleWithArea(a3, s1));
        //System.out.println(s1.isCompatibleWith(s1));


        //System.out.println(s1 instanceof Seals);
        System.out.println();


        Cage a4 = new Cage("LegendFalcon");
        int c1 = z.addArea(a4);
        Parrots pa1 = new Parrots("Pizontoo");
        Buzzards bu1 = new Buzzards("Vaseline");
        Buzzards bu2 = new Buzzards("Vasil");
        Parrots pa2 = new Parrots("Bluejean");
        System.out.println(z.addAnimal(c1, pa1));
        System.out.println(z.addAnimal(c1, bu1));
        System.out.println(z.addAnimal(c1, bu2));
        System.out.println(z.addAnimal(c1, pa2));
        a4.getAnimal();
        System.out.println();

        System.out.println(c1);
        System.out.println(z.getArea(c1));

        Enclosure a5 = new Enclosure("BigDog");
        Enclosure b5 = new Enclosure("BigDog");
        Zebra z1 = new Zebra("HandCream");
        Lion l1 = new Lion("JesusChrist");
        int e1 = z.addArea(a5);
        int e2 = z.addArea(b5);
        System.out.println(e1);
        System.out.println(z.getArea(e1));
        System.out.println(e2);
        System.out.println(z.getArea(e2));




        Cage a7 = new Cage("Eagle");
        int c2 = z.addArea(a7);
        System.out.println(c2);
        System.out.println(z.getArea(c2));





    }
}
