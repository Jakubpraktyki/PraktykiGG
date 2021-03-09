public class Main {
    public static void main(String[] args) {
        //zadanie1
        Pies mojPies = new Pies();
        mojPies.wydajDzwiek();
        mojPies.Spanie();
        mojPies.bawSie();
        mojPies.Sprawdzczyzyje();
        mojPies.Wiek();
        mojPies.bądźMilutki();
        System.out.println();
        //zadanie2
        Samochod mojsamochod = new Samochod();
        mojsamochod.Dodajgazu();
        mojsamochod.Skręcwlewo();
        System.out.println();
        //zadanie3
        RocznikWina wino = new RocznikWina();
        wino.kolorWina();
        wino.MarkaWina();
        wino.zawartoscalkoholu();
        wino.zawartosccukru();
        System.out.println();
        //zadanie5
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("Pole = "+ kwadrat.obliczPole());
        System.out.println("Obwod= " + kwadrat.obliczObwód());

    }
}
