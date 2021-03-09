public class Main {
    public static void main(String[] args) {
        //zadanie1
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("Pole Kwadratu = " + kwadrat.policzPole());
        Prostokat prostokat = new Prostokat(5,2);
        System.out.println("Pole Prostokatu = " + prostokat.Pole());
        //zadanie2
        Pies pies = new Pies(5,4,"Szarik");
        pies.DajGlos();
        //zadanie3
        Spawacz spawacz = new Spawacz(8000,"Pelny",false,true);
        spawacz.wykonujePrace();
        //zadanie4
        System.out.println("Odpowiedz na Punkt A: methodTwo, methodFour");
        System.out.println("Odpowiedz na Punkt B: methodThreee, methodOne");
        //A.methodTwo,method4

    }
}
