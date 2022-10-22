package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //pārbaudīt vai skaitlis ir pozitīvs
        int x = 5;
        if (x > 0) {
            System.out.println("true");
        }
        //negatīvs
        x = -3;
        if (x < 0) {
            System.out.println("false");
        }
        //ir lielāks par 5 un mazāks vai vienāds par 10 ar true
        x = 7;
        if (x > 5 && x <= 10 == true) {
            System.out.println("true");
        }
        //x NAV mazāks vai vienāds par 5 un x ir mazāks par 10(iegūt rezultātu true)
        x = 8;
        if (x != 5 && x < 10 == true) {
            System.out.println("true");
        }
        //x ir vienāds 0 vai x ir vienāds 10(rezultāts false)
        int y = 1;
        x = y;
        if (y == 0 && y == 10) {
            System.out.println("false");
        }
        //x * x reizinājums ir lielāks par 10 (rezultātus true)
        x = 11;
        if (x * x > 10) {
            System.out.println("true");
        }


        //Tajā pašā klasē un main metodē zemāk uzrakstīt programmu, kas pieņem Mēneša numuru(vesels skaitlis) un izvada uz ekrāna mēneša nosaukumu ar vārdu. (izmantot switch)
        int menesaNumurs = 2;
        switch (menesaNumurs) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }
//Tajā pašā klasē un main metodē zemāk uzrakstīt programmu, kas pieņem trīs veselus skaitļus un izvada uz ekrāna kurš ir lielākais no šiem trīs skaitļiem.
        //int a = 1;
        //int b = 2;
        // int c = 7;
        //if (a + b + c % 2 == 0) {
        //System.out.println("true");
//    }
//luksofors
        String luksoforaKrasa;
        System.out.println("Ievadi luksofora krāsu (sarkans, dzeltens vai zaļš):");
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            luksoforaKrasa = scanner.nextLine();

            if (luksoforaKrasa.equals("sarkans")) {
                System.out.println("Stāvi!");
            } else if (luksoforaKrasa.equals("dzeltens")) {
                System.out.println("Gaidi!");
            } else if (luksoforaKrasa.equals("zaļš")) {
                System.out.println("Ej!");
            } else {
                System.out.println("Cita krāsa!");
            }
        }
        //vizītkarte
        String printCard;
        System.out.println(" ");
        System.out.println("Vizītkarte");
        printCard();
        printNewLine();
        printCard();
        printNewLine();
        printCard();
        printBusinessCardTwo("Sorina","Jakovļeva",29437842,1980);
        printNewLine();
        printBusinessCardTwo("Andrejs","Jakovļevs",26199563,1979);
        System.out.println("Beidzas programma");


    }

    public static void printNewLine() {
        System.out.println(" ");
    }

    public static void printCard() {
        System.out.println("@@@@@@@@");
        System.out.println("Vārds:" + " Sorina");
        System.out.println("Uzvārds:" + " Jakovļeva");
        System.out.println("Tālruņa numurs:" + " +371 29437842");
        System.out.println("Dzimšanas gads:" + " 1980");
        System.out.println("@@@@@@@@");
    }

    //Vizītkarte Nr.2
    String printBusinessCardTwo;


    public static void printBusinessCardTwo(String vards, String uzvards, int talrunaNumurs, int dzimsanasGads) {
        System.out.println("@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println("Tālruņa numurs:" + talrunaNumurs);
        System.out.println("Dzimšanas gads:" + dzimsanasGads);
        System.out.println("@@@@@@@@");
    }



}
