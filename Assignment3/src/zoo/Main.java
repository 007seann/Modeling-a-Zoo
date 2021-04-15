package zoo;

import animals.*;
import areas.*;
import dataStructures.CashCount;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        // Test for an entrance with ID zero.
        Zoo z = new Zoo();
        Cage c = new Cage(1);
        int c1 = z.addArea(c);
        System.out.println(c1);

        Entrance e = new Entrance();
        int e1 = z.addArea(e);
        System.out.println(e1);

        Aquarium a = new Aquarium(2);
        int a1 = z.addArea(a);
        System.out.println(a1);

         */


        // Test for an Aquarium.
        Zoo z = new Zoo();

        Entrance e = new Entrance();
        int e1 = z.addArea(e);
        System.out.println(e1);
        System.out.println();


        /*
        Entrance ee = new Entrance();
        int e2 = z.addArea(ee);
        System.out.println(e2);
        System.out.println();
         */

        /*
        // Test for an entrance with ID zero.
        Cage c = new Cage(3);
        int c1 = z.addArea(c);
        System.out.println(c1);

        Parrot p1 = new Parrot("P1");
        Parrot p2 = new Parrot("P2");
        Parrot p3 = new Parrot("P3");
        Parrot p4 = new Parrot("P4");
        System.out.println(z.addAnimal(c1, p1));
        System.out.println(z.addAnimal(c1, p2));
        System.out.println(z.addAnimal(c1, p3));
        System.out.println(z.addAnimal(c1, p4));
        System.out.println();


         */
        //z.connectAreas(e2, c1);
        //ee.print();


        /*
        Aquarium a = new Aquarium(2);
        int a1 = z.addArea(a);
        System.out.println(a1);

        Shark s1 = new Shark("SK");
        Shark s2 = new Shark("SQ");
        Shark s3 = new Shark("SW");
        Starfish star1 = new Starfish("Star");

        System.out.println(z.addAnimal(a1, s1));
        System.out.println(z.addAnimal(a1, star1));
        System.out.println(z.addAnimal(a1, s2));
        System.out.println(z.addAnimal(a1, s3));
        //z.addAnimal(a1, star1);

        PicnicArea p = new PicnicArea();
        int picnic1 = z.addArea(p);
        z.connectAreas(e1, picnic1);
        e.print();

         */
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        //temp.add(0);
        //temp.add(1);
        //temp.add(2);
        System.out.println(z.visit(temp));
        System.out.println(z.findUnreachableAreas());
        //z.visit(0)


        /*
        System.out.println(z.cashCount);
        CashCount p1 = new CashCount();
        p1.setNrNotes_20pounds(2);
        p1.setNrNotes_10pounds(1);
        p1.setNrNotes_5pounds(3);
        p1.setNrCoins_2pounds(1);
        p1.setNrCoins_1pound(17);
        p1.setNrCoins_50p(1);
        p1.setNrCoins_20p(1);

        System.out.println(p1.getNrNotes_5pounds());
        System.out.println();
        System.out.println(p1.pay(85).getNrNotes_20pounds());
        System.out.println(p1.pay(85).getNrNotes_5pounds());


       // System.out.println(z.payEntranceFee(p1).getNrCoins_1pound());
        //System.out.println(z.cashCount.getNrCoins_1pound());
        //System.out.println(CashCount.add(z.cashCount, p1));


         */

        /*
        Cage c = new Cage("Movement");
        int c1 = z.addArea(c);
        Parrot pa1 = new Parrot("Pizontoo");
        Buzzard bu1 = new Buzzard("Vaseline");
        z.addAnimal(c1, pa1);
        z.addAnimal(c1, bu1);

        Aquarium a = new Aquarium("OceanWorld");
        int aq1 = z.addArea(a);
        Seal s1 = new Seal("Miki");
        z.addAnimal(aq1, s1);

         */
/*
        Aquarium a = new Aquarium("OceanWorld");
        int aq1 = z.addArea(a);
        Seal s1 = new Seal("Miki");
        z.addAnimal(aq1, s1);

        Cage c = new Cage("Movement");
        int c1 = z.addArea(c);

        Enclosure a5 = new Enclosure("BigDog");
        Enclosure b5 = new Enclosure("BigDog");
        Zebra z1 = new Zebra("HandCream");
        Lion l1 = new Lion("JesusChrist");
        int e1 = z.addArea(a5);
        int e2 = z.addArea(b5);
        z.addAnimal(e1, z1);
        z.connectAreas(c1, aq1);
        z.connectAreas(aq1, e1);
        System.out.println();
        c.print();
        a.print();
        a5.print();
        System.out.println();
        c.printPrev();
        a.printPrev();
        a5.printPrev();


 */



/*
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        //temp.add(3);
        System.out.println(z.visit(temp));
        System.out.println();
        System.out.println(z.isPathAllowed(temp));

 */

/*
        Entrance e = new Entrance("Love");
        int e1 = z.addArea(e);
        System.out.println(e1);

        PicnicArea p = new PicnicArea("Faith");
        int p1 = z.addArea(p);
        System.out.println(p1);

        Enclosure en = new Enclosure("Hope");
        int en1 = z.addArea(en);
        System.out.println(en1);


        Cage c = new Cage("WhatTheFuck");
        int c1 = z.addArea(c);
        System.out.println(c1);
        Parrot pa1 = new Parrot("Pizontoo");
        Buzzard bu1 = new Buzzard("Vaseline");
        Buzzard bu2 = new Buzzard("Vasil");
        Parrot pa2 = new Parrot("Bluejean");
        z.addAnimal(c1, pa1);
        z.addAnimal(c1, pa2);
        z.addAnimal(c1, bu1);
        z.addAnimal(c1, bu2);

        Aquarium a = new Aquarium("OceanWorld");
        int aq1 = z.addArea(a);
        System.out.println(aq1);
        Seal s1 = new Seal("Miki");
        Seal s2 = new Seal("Maka");
        Seal s3 = new Seal("MakaBro");
        z.addAnimal(aq1, s1);
        z.addAnimal(aq1, s2);
        z.addAnimal(aq1, s3);

        Aquarium a2 = new Aquarium("Disney");
        int aq2  = z.addArea(a2);
        System.out.println(aq2);

        Cage ca = new Cage("Nicol");
        int c2 = z.addArea(ca);




        //System.out.println(p1);
        //System.out.println(z.getArea(p1));
        z.connectAreas(e1, p1);
        z.connectAreas(p1, en1);
        z.connectAreas(en1, c1);
        z.connectAreas(c1, aq1);
        z.connectAreas(c1, aq2);
        z.connectAreas(c2, aq1);
        e.print();
        p.print();
        en.print();
        c.print();
        a.print();
        a2.print();
        System.out.println();
        e.printPrev();
        p.printPrev();
        en.printPrev();
        c.printPrev();
        a.printPrev();
        a2.printPrev();
        //en.printPrev();
        System.out.println();
        //System.out.println(visit);

        System.out.println();
        System.out.println(z.findUnreachableAreas());



 */




        /*
        Entrance a6 = new Entrance("WelcomeWorld");
        int en1 = z.addArea(a6);
        System.out.println(en1);rkfu
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
        a3.getAnimalFromArea();
        b3.getAnimalFromArea();
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
        a4.getAnimalFromArea();
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

         */


    }
}
