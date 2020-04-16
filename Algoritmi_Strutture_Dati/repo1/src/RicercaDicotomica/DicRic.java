package RicercaDicotomica;

import java.util.Scanner;

public class DicRic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many elements in the array? ");
        int [] array = generateArray(scn.nextInt());
        int sx = 0, dx = array.length-1;
        while((sx != dx) && )




    }

    public static int [] generateArray(int n){
        int [] array = new int[n];

        for(int i=0; i<array.length; i++) array[i] = i;
        return array;
    }
}
