package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        person Enrique = new person("Enrique", LocalDate.of(2000, 11, 24));

        System.out.println("La edad de " + Enrique.getName() + " es " + Enrique.getAge() + " años");

    }
}
