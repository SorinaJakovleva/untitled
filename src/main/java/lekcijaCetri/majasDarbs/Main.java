package lekcijaCetri.majasDarbs;

import lekcijaCetri.majasDarbs.classHomework.Trissturis;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();
        trissturis1.mala1 = 3;
        trissturis1.mala2 = 5;
        trissturis1.mala3 = 9;
        System.out.println(trissturis1.vienadmalu());
        System.out.println(trissturis1.vienadsanu());



        Trissturis trissturis2 = new Trissturis(7, 7, 7);
        System.out.println(trissturis2.countTriangleArea());
        System.out.println(trissturis2.vienadmalu());
        System.out.println(trissturis2.vienadsanu());

    }
}
