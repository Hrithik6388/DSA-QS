public class SubArray {
    public static void MaxSum(int number[]) {

        int cs = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = Integer.MAX_VALUE;
            }
            MaxSum = Math.min(cs, MaxSum);
        }

        System.out.println("MaxSum is " + MaxSum);
    }

    private static void main(String[] args) {
        int number[] = { -1, -2, -3 };

        MaxSum(number);
    }

}
