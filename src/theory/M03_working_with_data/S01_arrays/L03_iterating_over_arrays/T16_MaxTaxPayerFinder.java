package theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
The first line of the input contains N which is the number of companies in the
country.
The second line contains the yearly incomes of each company. All numbers are
non-negative integers.
The third line contains individual taxes for each company in percent of the
company's income. All numbers are integers from 0 to 100 inclusive.

You should output the number of the company that pays the most taxes. Keep in
mind that the enumeration of the companies starts with number 1. If there are
several companies with the same payment sizes, output the number of the company
with the lowest number.
*/

import java.util.Scanner;

public class T16_MaxTaxPayerFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCompanies = sc.nextInt();

        int[] yearlyIncomes = new int[totalCompanies];
        int[] percentsOfTaxes = new int[totalCompanies];

        for (int i = 0; i < totalCompanies; i++) {
            yearlyIncomes[i] = sc.nextInt();
        }

        for (int i = 0; i < totalCompanies; i++) {
            percentsOfTaxes[i] = sc.nextInt();
        }

        int companyNumber = 1;
        double maxTaxation = Double.MIN_VALUE;

        for (int i = 0; i < totalCompanies; i++) {
            double companyTaxation = (double) yearlyIncomes[i] / 100 * percentsOfTaxes[i];
            if (companyTaxation > maxTaxation) {
                maxTaxation = companyTaxation;
                companyNumber = i + 1;
            }
        }

        System.out.println(companyNumber);

        sc.close();
    }
}
