package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {
        Cilveks.printCount();
        Cilveks persona1 = new Cilveks("Pēteris");
        persona1.printName();
        Cilveks persona2 = new Cilveks("Anna");
        persona1.printName();
        persona2.printName();
    }
}
