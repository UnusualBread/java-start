package theory.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
A university has decided to open math courses and equip classrooms for 3 groups
with new special desks. The faculty agreed that for the sake of productivity,
only two students may share one desk. The enrollment has ended and the
university knows how many students are in each group. Now the task is to count
the number of desks. Of course, the university is short of money, so you need
to calculate the minimum number of desks required for each group. But don't
forget that each group will sit in its own classroom!
*/

public class T02_SumOfDesks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        scanner.close();

        int firstDesks = firstGroup / 2 + firstGroup % 2;
        int secondDesks = secondGroup / 2 + secondGroup % 2;
        int thirdDesks = thirdGroup / 2 + thirdGroup % 2;

        int sumOfDesks = firstDesks + secondDesks + thirdDesks;
        System.out.print(sumOfDesks);
    }
}
