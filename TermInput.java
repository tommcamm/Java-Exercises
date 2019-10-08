import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.DataInputStream;

import java.io.Console;

public class TermInput{

    public static void main(String[] args){
        //Example of taking user input from terminal
        //Thanks to the poster of this solution: https://stackoverflow.com/questions/5287538/how-can-i-get-the-user-input-in-java
        //First method: (Scanner)

        Scanner scn = new Scanner(System.in);

        int firstNumber = scn.nextInt();
        //In case of different type Java will throw an exception!, better cure this with a try statement...

        //Second method: (BufferReader and InputStreamReader)
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        //In this case we must use the parseInt method as BufferReader returns only a string type
        String rawString = bfr.readLine();
        int secondNumber = Integer.parseInt(rawString);

        //Third method: (DataInputStream)
        DataInputStream dis = new DataInputStream(System.in);
        int thirdInteger = dis.readInt();

        //Fourth method: (Console class)
        Console console = System.console();

        //Even in this case we must parse the integer with the parseInt method (We cannot do that with the primitive int as it is not an object!)
        String rawString2 = console.readLine();
        int fourthInteger = Integer.parseInt(rawString2);

    }
}