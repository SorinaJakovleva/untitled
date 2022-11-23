package lekcijaPieci.majasDarbs;

public class Main {
        public static void main(String[] args) {
            Cilindrs cylinder1 = new Cilindrs();
            cylinder1.setAugstums(8);
            cylinder1.setRadiuss(10);
            System.out.println("Cilindra radius ir " + cylinder1.getRadiuss());
            System.out.println("Cilidra augstums ir " + cylinder1.getAugstums());
            cylinder1.rekinatCylindraTilpumu();
            cylinder1.rekinatCylindraVirsmasLaukumu();

            Cilindrs cylinder1 = new Cilindrs(4, 7);
            System.out.println("Cilindra radius ir " + cylinder1.getRadiuss());
            System.out.println("Cilindra augstums ir " + cylinder1.getAugstums());
        }
    }

