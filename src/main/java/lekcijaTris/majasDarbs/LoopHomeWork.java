package lekcijaTris.majasDarbs;
import java.util.Scanner;

public class LoopHomeWork {
    //Uzrakstiet programmu, kas no lietotāja nolasa veselus skaitļus un apstājas, izvadot uz ekrānu tekstu:  “Gatavs”, kad šo vērtību summa pārsniedz 100.
    //Ir nepieciešams izmantot: while ciklu.
    public static void main(String[] args) {
        pirmaisUzdevums();
        System.out.println("\n");
        otraisUzdevums();
        System.out.println("\n");
    }

    public static void pirmaisUzdevums() {
        Scanner ievade = new Scanner(System.in);
        int skaitluSumma = 0;
        while (skaitluSumma <= 100){
            System.out.println("Insert number: ");
            int number = ievade.nextInt();
            skaitluSumma = skaitluSumma + number;
            System.out.println("Gatavs");
        }
    }
    //Definēt trīs* masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības izmantojot:
    //while;
    //do while;
    //for loop;
    //for each.
    public static void otraisUzdevums() {
String[] menesuNosaukumi = {"Janvāris", "Februāris", "Marts", "Aprīlis"};
int i = 0;
while (i <menesuNosaukumi.length){
    System.out.println(menesuNosaukumi[i]);
    i ++;
}
int q = 0;
do {
    System.out.println(menesuNosaukumi[q]);
    q ++;
}
while (q < menesuNosaukumi.length);
for (int j = 0; j < menesuNosaukumi; j++) {
    System.out.println(menesuNosaukumi[j]);
}
    for (String menesis : menesuNosaukumi){
        System.out.println(menesis);
    }


    int[] menesaTerini = {100, 40, 23, 44, 55, 200};
    int ii = 0;
    while (ii <menesaTerini.length){
        System.out.println(menesaTerini[ii]);
        ii ++;
    }
    int qq = 0;
    do{
        System.out.println(menesaTerini[qq]);
        qq ++;
            }
    while (qq < menesaTerini.length);

    for (int jj = 0; jj < menesaTerini.length; jj++){
        System.out.println(menesaTerini[jj]);
    }
    for (int novembris : menesaTerini){
        System.out.println(novembris);
    }

    char[] menesuSeciba = {'I', "II", "III", "IV", 'V', "VI", "VII", "VIII", "IX", 'X', "XI", "XII"};
    int iii = 0;
    while (iii < menesuSeciba.length){
        System.out.println(menesuSeciba[iii]);
        iii ++;
            }
    int qqq = 0;
    do {
        System.out.println(menesuSeciba[qqq]);
        qqq ++;
    }
    while(qqq < menesuSeciba.length);

    for (int jjj = 0; jjj < menesuSeciba.length; jjj++){
        System.out.println(menesuSeciba[jjj]);
    }
    for (char kartasNumurs : menesuSeciba){
        System.out.println(kartasNumurs);
    }
// Uzdevums
//Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem. Visas vērtības, kas ir iekšā masīva, ir nepieciešams izvest uz ekrāna vienā līnijā.
private static void tresaisUzdevums() {
    int[] skaitluMasivs =  new int[99];
    for (int v = 0; v < skaitluMasivs.length; v++) {
        skaitluMasivs[v] = v * 2;
    }
    for (int vertiba : skaitluMasivs) {
        System.out.print(vertiba);
    }
}

}
