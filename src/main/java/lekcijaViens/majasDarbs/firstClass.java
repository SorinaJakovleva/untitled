package lekcijaViens.majasDarbs;

public class firstClass {
    public static void main(String[] args) {
        String valstsNosaukums = "Vjetnama";
        String teksts = "valstsNosaukums ir: ";
        System.out.println(teksts + valstsNosaukums);

        double iedzivotajuSkaits = 94.57;
        System.out.println(valstsNosaukums + " dzīvo " + iedzivotajuSkaits + " miljnonu cilvēku ");
int platiba = 331690;
System.out.println(valstsNosaukums + " platība ir "+ platiba + " km2");
String galvaspilseta = "Hanoja";
System.out.println(valstsNosaukums + " galvaspilsēta ir " + galvaspilseta);
String oficalaValoda = "vjetnamiešu valoda";
        boolean vaiIrEsDalibvalsts = false;
        System.out.println("Vai " + valstsNosaukums + " ir ES dalībvalsts? " + vaiIrEsDalibvalsts);
        //Vjetnamas valūta ir Vjetnamas dongs, bet tā kā simbolu nav, vai es neprotu to atrast, es piešķīru dollārzī, lai būtu paraugs valūtai
        char valuta = '$';
        System.out.println(valstsNosaukums + " oficiālā valūta ir " + " Vjetnamas dongs " + valuta);

//
        int a = 32;
        int b = -4;
        int summa;
        summa = a + b;
        System.out.println(summa);
        int rezultats = a/b;
        System.out.println(rezultats);
        //šeit rezultāts tiek attēlots veselam skaitlim, bez komata
        int rezultats2 = (a-b)/a*b;
        System.out.println(rezultats2);

    }
}
