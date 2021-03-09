public class Spawacz extends Praca{
    private boolean niebezpieczna;

    public Spawacz(double pensja, String etat, boolean Fajna, boolean niebezpieczna)
    {
        super(pensja, etat, Fajna);
    }

    public boolean isNiebezpieczna() {
        return niebezpieczna;
    }

    public void setNiebezpieczna(boolean niebezpieczna) {
        this.niebezpieczna = niebezpieczna;
    }

    @Override

    public void wykonujePrace() {
        System.out.println("Nie Wykonuje czynności");
    }
}