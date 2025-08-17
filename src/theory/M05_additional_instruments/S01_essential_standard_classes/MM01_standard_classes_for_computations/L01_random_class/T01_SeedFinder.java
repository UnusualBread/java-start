package theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L01_random_class;

/*
Your job is to find the seed between A and B (both inclusive) that produces N
pseudorandom numbers from 0 (inclusive) to K (exclusive). It should also have
the maximum of these N numbers to be the minimum among all maximums of other
seeds in this range.
*/

import java.util.Random;
import java.util.Scanner;

public class T01_SeedFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSeed = sc.nextInt();
        int secondSeed = sc.nextInt();
        int totalNumbers = sc.nextInt();
        int totalRandom = sc.nextInt();
        sc.close();

        int minNumber = Integer.MAX_VALUE;
        int minSeed = 0;

        for (int i = firstSeed; i < secondSeed + 1; i++) {
            Random random = new Random(i);
            int maxNumber = 0;

            for (int j = 0; j < totalNumbers; j++) {
                int number = random.nextInt(totalRandom);

                if (number > maxNumber) maxNumber = number;
            }

            if (maxNumber < minNumber) {
                minNumber = maxNumber;
                minSeed = i;
            }
        }

        System.out.println(minSeed);
        System.out.println(minNumber);
    }
}
