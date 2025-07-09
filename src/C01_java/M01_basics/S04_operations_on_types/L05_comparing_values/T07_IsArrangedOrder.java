package C01_java.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
You need to write a program that checks if the boys are arranged in ascending
or descending order by height. The program must read three integer numbers h1,
h2, h3 and outputs true or false. If boys have the same height, they are
considered as correctly arranged.
*/

import java.util.Scanner;

public class T07_IsArrangedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstHeight = sc.nextInt();
        int secondHeight = sc.nextInt();
        int thirdHeight = sc.nextInt();

        System.out.println(firstHeight >= secondHeight && secondHeight >= thirdHeight || firstHeight <= secondHeight && secondHeight <= thirdHeight);

        sc.close();
    }
}
