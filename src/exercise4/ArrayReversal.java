package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = input.nextInt();

        char [] symbols = new char[size];

        System.out.println("Enter symbols: ");
        for (int index = 0; index < symbols.length; index++) {
            symbols[index] = input.next().charAt(0);
        }
       
       char[] reversedSymbols = new char[size];
       int reversedIndex = 0;
       for (int index = symbols.length - 1; index >= 0; index--) {
         reversedSymbols[reversedIndex] = symbols[index];
         reversedIndex++;
       }

       String reversedString =Arrays.toString(reversedSymbols);
       System.out.println("Reversed symbols: " + reversedString);
       
        
    }

}