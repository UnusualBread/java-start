package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L01_random_class;

/*
For the given numbers K, N and M, begin iterating through the various seeds
starting from K: (K, K+1, K+2...). In each iteration, use that seed for a
random generator and get N random Gaussian numbers using the
Random.nextGaussian() method. Output the seed for which all N Gaussian numbers
are less than or equal to M.
*/

import java.util.Random;
import java.util.Scanner;

public class T03_GaussianSeedFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startSeed = sc.nextInt();
        int totalNumbers = sc.nextInt();
        double threshold = sc.nextDouble();
        sc.close();

        for (int i = startSeed; ; i++){
            Random random = new Random(i);
            boolean isFound = true;

            for (int j = 0; j < totalNumbers; j++) {
                double number = random.nextGaussian();

                if (number > threshold) {
                    isFound = false;
                    break;
                }
            }

            if (isFound) {
                System.out.println(i);
                break;
            }
        }
    }
}
