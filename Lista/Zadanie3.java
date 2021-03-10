package Lista;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        int intA = 0;
        int intB = 0;
        String pierwszy;
        String drugi ;
        List<String>lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);


        lista.add(0,"1");
        lista.add(1,"2");
        lista.add(2,"3");
        lista.add(3,"4");
        lista.add(4,"5");
        lista.add(5,"6");
        lista.add(6,"7");
        lista.add(7,"8");
        lista.add(8,"9");
        lista.add(9,"10");
        System.out.println(lista);
        System.out.println("Podaj pierwszą  wartosc z listy którą chcesz zmienić: ");
        intA = sc.nextInt();
        System.out.println("Podaj drugą  wartosc z listy którą chcesz zmienić: ");
        intB = sc.nextInt();
        System.out.println("Podaj nową nazwę pierwszej wartości: ");
        pierwszy = sc.next();
        System.out.println("Podaj nową nazwę drugiej wartości: ");
        drugi = sc.next();
        lista.remove(intA);
        lista.remove(intB);
        lista.add(intA,pierwszy);
        lista.add(intB, drugi);
        System.out.println(lista);
    }

}