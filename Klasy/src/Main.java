import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // zadanie 1
        System.out.println();
        System.out.println("ZADANIE 1");
        System.out.println();
        Trojkat trojkat = new Trojkat(1,5,10);
        trojkat.ObliczPole();
        System.out.println(trojkat.getPole());
        System.out.println("zadanie 1");








            //zadanie 2

        Prostokat prostokat = new Prostokat(2, 4);

        int pole = prostokat.obliczPole();

        double przekatna = prostokat.obliczPrzekatna();

        System.out.println("Pole = " + pole + "\t  Przek. = " + przekatna);

        prostokat.setBokA(3);
        System.out.println(prostokat.getBokA());



        System.out.println();



        // zadanie 3
        if (Trojkat.getBokA() > prostokat.getBokA())
          {
            System.out.println("Bok trójkąta = "+Trojkat.getBokA()+" jest większy od boku prostokąta = "+prostokat.getBokA());
        }
        if(Trojkat.getBokA() < prostokat.getBokA()) {
            System.out.println("Bok prostokąta = " + prostokat.getBokA() + " jest większy od boku trójkąta = " + trojkat.getBokA());
        }

        System.out.println();
        //zadanie 4(okrag)

        okrag okrag = new okrag(3,5);
        System.out.println("Pole okregu = "+ okrag.Pole()+"\tObwód = " + okrag.Obwod());
        System.out.println();

        // zadanie 4(kalkulator)

        boolean programIsRunning = true;

        SimpleCalculator calculator = new SimpleCalculator();
        while (programIsRunning) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Co chcesz robić:\n[1] Dodać\n[2] Odjąć\n[3] Mnożyć\n[4] Dzielić\n[5] Wyjść");

            String userChoice = sc.next();
            System.out.println("Podaj a");
            double a = sc.nextDouble();
            System.out.println("Podaj b");
            double b = sc.nextDouble();

            switch (userChoice) {
                case "1": {
                    System.out.println(calculator.add(a, b) + "\n\n");
                    break;
                }
                case "2": {
                    System.out.println(calculator.difference(a, b));
                    break;
                }
                case "3": {
                    System.out.println(calculator.multiply(a, b));
                    break;
                }
                case "4": {
                    System.out.println(calculator.divide(a, b));
                    break;
                }
                case "5": {
                    programIsRunning = false;
                    break;
                }
                default: {
                    System.out.println("Błędny wybór");
                    break;
                }
            }

        }



    }
}
