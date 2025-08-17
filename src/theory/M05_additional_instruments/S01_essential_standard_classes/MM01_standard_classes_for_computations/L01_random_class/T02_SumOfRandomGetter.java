package theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L01_random_class;

import java.util.Random;
import java.util.Scanner;

public class T02_SumOfRandomGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int firstNumber = sc.nextInt();
        int lastNumber = sc.nextInt();
        sc.close();

        int seed = firstNumber + lastNumber;
        Random random = new Random(seed);
        int sum = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int number = random.nextInt(lastNumber - firstNumber + 1) + firstNumber;
            sum += number;
        }

        System.out.println(sum);
    }
}
