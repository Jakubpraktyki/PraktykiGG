public class Przyklad6 {
    public static void main(String[] args) {
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};

        for (int i = 0; i < 9; i++) {
            System.out.println("Element[" + i + "] = " + power[i]);
        }
        System.out.println("\nPo odwróceniu\n");
        for (int j = 8; j >= 0; j-- )
        {
            System.out.println("Element["+j+"]"+ power[j] );
        }

    }
}