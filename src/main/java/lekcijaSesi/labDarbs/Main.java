package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        System.out.println(faker.shakespeare().hamletQuote());

// adresi, telefona numuru, epastu, uzvardu, vienu pēc brīvas izvēles

        System.out.println(faker.address().country());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.name().firstName() + faker.name().lastName() + faker.nation());
        System.out.println(faker.name().fullName());

    }
}
