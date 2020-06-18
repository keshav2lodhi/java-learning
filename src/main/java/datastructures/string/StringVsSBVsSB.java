package datastructures.string;

/**
 * String vs StringBuffer vs StringBuilder
 **/
public class StringVsSBVsSB {

    public static void concat1(String s1) {
        s1 = s1 + "forgeeks";
    }

    public static void concat2(StringBuffer s2) {
        s2 = s2.append("forgeeks");
    }

    public static void concat3(StringBuilder s3) {
        s3 = s3.append("forgeeks");
    }

    public static void main(String[] args) {


        String str = "Geeks";
        StringBuffer sbf = new StringBuffer("Geeks");
        StringBuilder sb = new StringBuilder("Geeks");

        concat1(str);
        System.out.println(str);

        concat2(sbf);
        System.out.println(sbf);

        concat3(sb);
        System.out.println(sb);

    }
}
