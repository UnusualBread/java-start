package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
Paul loves to ride public transport and after receiving a ticket, he
immediately checks whether he got a lucky one. A ticket is considered a lucky
one if the sum of the first three numbers of this ticket matches the sum of the
last three numbers.
However, Paul does not count well in his head. That is why he asks you to write
a program which will check the equality of the sums and display "Lucky" if the
sums match, and "Regular" if the sums differ.
*/

import java.util.Scanner;

class T07_LuckyTicketChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticketNumber = sc.nextLine();
        sc.close();

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < ticketNumber.length(); i++) {
            char ch = ticketNumber.charAt(i);
            int digit = Character.getNumericValue(ch);

            if (i < 3) firstSum += digit;
            else secondSum += digit;
        }

        System.out.println(firstSum == secondSum ? "Lucky" : "Regular");
    }
}
