 public class Przyklad5 {
   public static void main(String[] args) {

    double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};

       int mmax = 0;
       int mmin = 0;


     for (int i = 0; i < power.length; i++) {
     System.out.println("Element[" + i + "] = " + power[i]);


    }
  System.out.println("\nZamiana  Najwiekszej liczby z Najmniejszą liczba:\n");


  int max = (int) power[0];
   int min = (int) power[0];
  for (int i = 0; i < 9; i++) {
    if (power[i] > max) {
        max = (int) power[i];
        mmax = i;

    }
     if (power[i] < min) {
         min = (int) power[i];
         mmin = i;
     }
    }
    power[mmax] = min;
   power[mmin] = max;

  for (int j = 0; j < 9; j++) {
      System.out.println("Element [" + j + "]" + power[j]);

   }


  }
}


