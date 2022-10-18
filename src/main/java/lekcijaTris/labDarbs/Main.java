package lekcijaTris.labDarbs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sākās programma");
        printCard("Pēteris", "Kalniņš", "Ventspils", 43);
        printetVizitkarti();
        printetVizitkarti();
        System.out.println("Beidzas programma");
        int laukums = aprekinatTaisnsturaLaukumu(4, 2);
        System.out.println("Taisnstūra laukums ir: " + laukums);
    }

    public static void printNewLine() {
        System.out.println("\n");

    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;

    }

    public static void printetVizitkarti() {
        System.out.println("@@@@@@@@");
        System.out.println("Sorina Jakovļeva");
        System.out.println("Rīga");
        System.out.println("$$$$$$$$");

    }

    public static void printCard(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums:" + vecums);


        //masīva izmērs ir 3
        String dogName;
        String dogname2 = "Reksis";

        int[] menesaTerini = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};


        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas
        System.out.println(menesaTerini[3]);

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa


        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);

        int x = 5;
        while (x > 0) {
            System.out.println("X nav nulle, X = " + x);
            x= x-1;
        }

        String[] cars2 = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("kods sākās");
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z = z + 1;
        }

        System.out.println("kods turpinās");

    }
}

