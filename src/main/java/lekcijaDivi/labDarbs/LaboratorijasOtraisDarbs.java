package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijasOtraisDarbs {
    private static Scanner scanner;

    public static void main(String[] args) {
        int vecums = 19;

        if (vecums >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        }
        System.out.println("Hello Lekcija 2");

        if (vecums >= 18) {
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
        }

        System.out.println("Programmas turpinājums...");
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Ievadi cilveka vecumu...");

            System.out.println("Kā tevi sauc?");
            String name = scanner.nextLine();
            System.out.println("Labdien, " + name + "Esi sveicināts/a manā programmā");
        }

        //Salīdzināšanas izteiksmes
        //lielāks
        int x = 3;
        int y = 2;
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x < y);
        //mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x > y);
        //vienāds
        System.out.println(x == y);
        System.out.println(5 == 5);
        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));

        //nav vienāds
        System.out.println(x != y);
        System.out.println(!luksaforaKrasa.equals("red"));

        //mazāks vienāds
        x = 5;
        y = 5;
        System.out.println(x <= y);

        int vecums2 = 15;
        System.out.println("Vai cilvēks var balsot(kļūdains vairants)?" + (vecums2 > 18));
        System.out.println("Vai cilvēks var balsot?" + (vecums2 >= 18));


        int age = 18;
        System.out.println("Paskaties cilvēka pasē");
        if (age >= 18) {
            System.out.println("Drīkst balsot");
        }
        System.out.println("Tālākas darbības");

//pārbaudīt vai skaitlis ir negatīvs, ja ir, izvadīt uz ekrāna - NEGATĪVS
        int skaitlis = -5;
        if (skaitlis <= -1) {
            System.out.println("NEGATĪVS");
        }

        int age1 = 18;
        boolean hasVoted = false;

        System.out.println("Paskaties cilvēka pasē");
        if (age1 >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot");
        }

        //es aizeju un nobalsoju
        hasVoted = true;

        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot");
        }


        System.out.println("Ievadīsim skaitli i");
        int i = 17;
        if (i == 10) {
            System.out.println("Skaitlis ir 10");
        }

// KODS - LUKSOFORS
        String trafficLight;
        System.out.println("Enter traffic light color (red, yellow or green):");
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            trafficLight = scanner.nextLine();

            if (trafficLight.equals("red")) {
                System.out.println("Stay!");
            } else if (trafficLight.equals("yellow")) {
                System.out.println("Wait!");
            } else if (trafficLight.equals("green")) {
                System.out.println("Go!");
            } else {
                System.out.println("Wrong color!");
            }
//noteikt vai ievadītais skaitlis ir pāra vai nepāra skaitlis
            number = scanner.nextInt();
        }
        //te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
        if (number % 2 == 0) {
            System.out.println(number + " ir pāra skaitlis");
        } else {
            System.out.println(number + " ir nepāra skaitlis");
        }

        int monthNumber = 2;
        switch (monthNumber) {
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
                break;
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }
        String animal = "DOG";
        String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
            default:
                result = "Unknown animal";
        }

        System.out.println("This animal is: " + result);


        System.out.println("Ievadi skaitli g");
        int g = scanner.nextInt();
        if (g < 0) {
            System.out.println("Skaitlis ir negatīvs");
        } else if (g == 0) {
            System.out.println("Skaitlis ir nulle");
        } else {
            System.out.println("Skaitlis ir pozitīvs");
        }


        //zaļa gaisma, sarkana gaisma, dzeltena gaisma, nedeg neviena gaisma(skaties zimes)

        //ievadi skaitli - izvadi vai pozitivs/negativs vai nulle


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hello Lekcija 2");
        int vecums1;
        System.out.println("Kā tevi sauc?");
        String name = scanner1.nextLine();
        System.out.println("Labdien, " + name + "! Esi sveicināts/a manā programmā");

        System.out.println("Ievadi cilveka vecumu...");
        vecums1 = scanner1.nextInt();

        if (vecums1 >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        }

        System.out.println("Programmas turpinājums...");

        System.out.println("Ievadi skaitli a");
        int a = scanner.nextInt();
        System.out.println("Ievadi skaitli b");
        int b = scanner.nextInt();
        int summa = a + b;
        System.out.println("Skaitla " + a + " un Skaitla " + b + " Summa ir " + summa);

    }

}
