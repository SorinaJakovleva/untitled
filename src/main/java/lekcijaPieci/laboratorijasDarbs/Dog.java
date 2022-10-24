package lekcijaPieci.laboratorijasDarbs;

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("VAU VAU VAU");
    }

    public void grow(){
        System.out.println("RRRRRRRRRRRRR");
    }
    public Dog(int age){
        super.age = age;
    }
}
