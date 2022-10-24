package lekcijaPieci.laboratorijasDarbs;

public class Main {
    private static String vaiPrivatipasums;

    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog(6);
        Cow govs = new Cow();
        muris.age = 3;
        reksis.age = 6;
        muris.breathe();
        reksis.breathe();

        muris.makeSound();
        reksis.makeSound();

        muris.sharpenClaws();
        reksis.grow();

        muris.printClimbing();

//        public void printHouse                                                                  () {
//            System.out.println("House{" + "stavuDaudzums=" + stavuDaudzums + ", loguSkaits=" + loguSkaits + ", durvjuSkaits=" + durvjuSkaits + ", adrese='" + adrese + '\'' + ", griestuAugstums=" + griestuAugstums + ", kadastralaVertiba=" + kadastralaVertiba + ", vaiPrivatipasums=" + vaiPrivatipasums + '}');
//        }
//        House house = new House(1,2,3,"Brivibas", 2.5,100000L,true);
//
//        Calculator kalkulators = new Calculator();
//        return System.out.println(kalkulators.add());
    }
}
