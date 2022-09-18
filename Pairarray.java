public class Pairarray {

    // Print the pair of an Array.

    public static void PrintPair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int a = number[i];
            for (int j = i; j < number.length; j++) {
                System.out.print("(" + a + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total Par =" + tp);

    }

    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        PrintPair(number);

    }

}