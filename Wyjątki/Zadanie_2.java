package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        int[] tab = new int[4];
        Scanner sc = new Scanner(System.in);
        try {


            for (int i = 0; i < 5; i++) {

                tab[i] = sc.nextInt();
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("nieprawidłowa wartość");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Przekroczona wielkość tablicy");
        }
        }
    }
