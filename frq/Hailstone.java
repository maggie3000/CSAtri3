/*
Maggie Killada
AP CSA 2020 FRQ #1
*/

package frq;

public class Hailstone
{

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n)
    {
        int hLength = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                hLength++;
            } else {
                n = 3 * n + 1;
                hLength++;
            }
        }
        return hLength;
    }

    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n)
    {
        if (n > hailstoneLength(n)) {
            return false;
        }
        else { return true;}
    }

    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n)
    {
        double longTotal = 0.0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)){
                longTotal++;
            }
        }
        return (double) longTotal/n;
    }
}