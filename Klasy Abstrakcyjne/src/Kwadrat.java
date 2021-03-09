public class Kwadrat implements ObliczeniaDlaFigur{
    private int bokA;

public Kwadrat(int bokA)
{
    this.bokA = bokA;
}

    @Override
    public int obliczPole() {
        return bokA*bokA;
    }

    @Override
    public int obliczObwód() {
        return 4*bokA;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }
}
