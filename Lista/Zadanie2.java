package Lista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        List<String>lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

try {


    lista.add(0, "1");
    lista.add(1, "2");
    lista.add(2, "3");
    lista.add(3, "4");
    lista.add(4, "5");
    lista.add(5, "6");
    lista.add(6, "7");
    lista.add(7, "8");
    lista.add(8, "9");
    lista.add(9, "10");
    System.out.println(lista);


    for (int i = 0; i < 5; i++) {
        lista.remove(sc.nextInt());

    }
    System.out.println(lista);

}catch (InputMismatchException inputMismatchException){
    System.out.println("Podałeś złe dane");
}catch (IndexOutOfBoundsException indexOutOfBoundsException){
    System.out.println("Podałeś złe dane");
}
}
    }


