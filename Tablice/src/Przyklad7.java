import java.util.Random;

public class Przyklad7
{
    public static void main(String[] args)
    {
        Random random = new Random();
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
        int wylosowanaliczba = random.nextInt(9);
        int wylosowanaliczba2 = random.nextInt(9);
        if (power[wylosowanaliczba] > power[wylosowanaliczba2])
        {
            System.out.println("Liczba " + power[wylosowanaliczba] + " jest większa od liczby " + power[wylosowanaliczba2]);
        }
        if (power[wylosowanaliczba] < power[wylosowanaliczba2])
        {
            System.out.println("Liczba " + power[wylosowanaliczba] + " jest mniejsza od liczby " + power[wylosowanaliczba2]);
        }
        if (power[wylosowanaliczba] == power[wylosowanaliczba2])
        {
            System.out.println("Liczba " + power[wylosowanaliczba] + " jest równa liczbie " + power[wylosowanaliczba2]);
        }
    }
}