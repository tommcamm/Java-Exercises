package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean x;
        Scanner scn = new Scanner(System.in);
        String M= "ABCDEFGHIJKLMNOPQRSTUUWXYZ";
      //se la stringa contiene caratteri maiuscoli
        System.out.println("Ins stringa");
        String test= scn.nextLine();

        if(test.contains(M)){
            System.out.println("Maiuscoleeee");
        }else {
            System.out.println("NO MAIUSCOLEEE");
        }
    }
}