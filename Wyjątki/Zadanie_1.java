package Wyjatki;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        int intRandom;




     try {

         for (int i = 0; i < 11; i++) {

             intRandom = random.nextInt(100);
             array[i] = intRandom;
             System.out.println(array[i]);

         }
     }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
     {
         System.out.println("tablica jest juz pełna nie można wypisać więcej danych");
     }
        System.out.println("\nKoniec Programu");
        sc.close();
    }



    }





