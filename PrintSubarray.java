
public class PrintSubarray {

    public static void printSubarray(int number[]) {
        int tp = 0;

        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(number[k]);

                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarray=" + tp);

    }

    public static void main(String args[]) {

        int number[] = { 3, 1, 8, 5, 9, 5, 3, 4, 6, };

        printSubarray(number);
    }

}