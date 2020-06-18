package datastructures.string;

/**
 * Reverse a String using recursion
 **/
public class StringReverse {

    public static String reverse(String str) {

        if (str.isEmpty()) {
            System.out.println("Empty String");
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "keshav";
        String reverse1 = reverse(str);
        System.out.println(reverse1);
    }
}
