package lekcijaPieci.staticPiemers;

public class Cilveks {
    public String name;
    public int age = 0;
    public static int count=1;
    public int darbiniekaNumurs;


    public Cilveks(String name) {
        this.name = name;
        count++;
    }

    public static void printCount() {
    }

    public void printName(){
        System.out.println("Cilveka vards ir:" + name);
    System.out.println("Darbinieka numurs ir: " + darbiniekaNumurs);
    }

}
