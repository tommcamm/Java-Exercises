package esercizio0;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        Macchina panda = new Macchina(4, 3400);
        Macchina panda2 = new Macchina(4, 3400);
        Macchina pandona = new Macchina(4, 4000);

        System.out.println(panda.equals(panda2));
        System.out.println(panda.equals(pandona));
    }
}
