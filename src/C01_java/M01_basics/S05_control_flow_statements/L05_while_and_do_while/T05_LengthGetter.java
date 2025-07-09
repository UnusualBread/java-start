package C01_java.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

/*
For its input, the program gets a sequence of non-negative integers;
each integer is written on a separate line. The sequence ends with an
integer 0; when the program reads 0, it should end its work and output
the length of the sequence (not counting the final 0).
*/

import java.util.Scanner;

public class T05_LengthGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = -1;
        int number;

        do {
            number = sc.nextInt();
            count++;
        } while (number != 0);

        System.out.println(count);

        sc.close();
    }
}
