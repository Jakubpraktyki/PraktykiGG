public class Pies extends Zwierze{
    private int Siersc;
    private int dlugoscOgonu;
    public Pies(int wiek, int iloscKonczyn,String nazwa)
    {
        super(wiek,iloscKonczyn,nazwa);
    }
    @Override
    public void DajGlos()
    {
        System.out.println("Hau Hau");
    }

}
