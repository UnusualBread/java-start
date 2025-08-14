package theory.M01_basics.S06_strings.L03_stringbuilder;

/*
Implement a method to concatenate all strings from the given array to a single
long string. You must skip all digits inside the input strings.
*/

import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sbStr = new StringBuilder();

        for (String str : strings) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!Character.isDigit(ch)) {
                    sb.append(ch);
                }
            }

            sbStr.append(sb);
        }

        return sbStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
