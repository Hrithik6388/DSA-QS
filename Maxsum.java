public class Maxsum {

    public static void kadens(int number[]) {

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = number[i];
            }

            ms = Math.max(cs, ms);

        }

        System.out.println("our maxsum is " + ms);

    }

    public static void main(String args[]) {
        int number[] = { -5, -6, -2, -8, };

        kadens(number);

    }

}
