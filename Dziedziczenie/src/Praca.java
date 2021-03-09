public class Praca
{
    private int pensja;
    private String etat;
    private boolean Fajna;


    public Praca (double pensja, String etat, boolean fajna)
    {
    }

    public boolean isFajna() {
        return Fajna;
    }

    public void setFajna(boolean fajna) {
        this.Fajna = fajna;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    public void wykonujePrace()
    {
        System.out.println(" Wykonuje czynność");
    }

}