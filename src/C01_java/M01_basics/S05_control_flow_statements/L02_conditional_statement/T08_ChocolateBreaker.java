package C01_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

/*
Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?

Now think of chocolate as an N x M rectangle divided into little segments:
N segments in width and M in height. Each segment is 1x1 and unbreakable.
Find out whether it is possible to break off exactly K segments from the
chocolate with a single straight line: vertical or horizontal.
*/

import java.util.Scanner;

public class T08_ChocolateBreaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolateWidth = sc.nextInt();
        int chocolateHeight = sc.nextInt();
        int segmentsToGet = sc.nextInt();

        if ((segmentsToGet % chocolateWidth == 0 || segmentsToGet % chocolateHeight == 0) && segmentsToGet <= chocolateHeight * chocolateWidth) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
