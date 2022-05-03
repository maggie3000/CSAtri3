/*
Maggie Killada
AP CSA 2020 Sample Questions FRQ #2
*/

package frq;

public class CheckDigit {

    /** Returns the check digit for num
     * Precondition: The number of digits in num is between one and six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num)
    { return 3; }

    /** Returns true if numWithCheckDigit is valid, or false otherwise,
     * as described in part (a)
     * Precondition: The number of digits in numWithCheckDigit is
     * between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        int num = numWithCheckDigit / 10;
        int checkDigit = numWithCheckDigit % 10;
        return getCheck(num) == checkDigit;
    }
    // There may be variables and methods not shown.

    /*
    "Add a static class variable to the CheckDigit class that will be called 'failedCount' and add
    that to the 'isValid' method and increment the count after if isValid returns to true."
     */
}
