package String;

// Vail Panlindrom
public class Palindrom {

    public static boolean isPalindrom(String str) {
        if (str == null || str.length() == 0) {// if string is null

            return false;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "");// replace all non alphanumeric
        str = str.toLowerCase(); // to uppercase to lowercase

        // check first letter = last letter (for palindrom)
        for (int i = 0; i < str.length() / 2; i++) {

            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {

                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrom(str));
    }

}
