package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the
same characters of the input string are replaced by the symbol and the number
of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and
outputs the encoded sequence. The encoding must be case sensitive.
*/

import java.util.Scanner;

public class T14_StringCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String encodedStr = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            if (ch1 == ch2) count++;
            else {
                encodedStr += ch1 + "" + count;
                count = 1;
            }
        }

        encodedStr += str.charAt(str.length() - 1) + "" + count;

        System.out.println(encodedStr);
    }
}
