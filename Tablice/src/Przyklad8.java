import java.util.Scanner;
public class Przyklad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];

        System.out.println("Podaj imie:");
        person[0] = scanner.next();
        System.out.println("Podaj wiek:");
        person[1] = scanner.next();
        System.out.println("Podaj ulubiony kolor:");
        person[2] = scanner.next();
        System.out.println("Podaj nazwe klubu pilkarskiego:");
        person[3] = scanner.next();

        System.out.println("Wszystkie informacje: ");
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);

    }
}
