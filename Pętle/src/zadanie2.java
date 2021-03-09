

public class zadanie2 {
    public static void main(String[] args) {
        int intA = 0;
        int intB = 1;
        int intC = 0;
        int intX = 7;
        for (int i = 0; i < intX; i++)
        {
            intA = intB;
            intB = intC;
            intC = intA + intB;

            System.out.print(intC +"\t");


        }
        System.out.println();


    }
}

