/*
Maggie Killada
AP CSA 2015 FRQ #1
*/

package frq;

public class DiverseArray{

    /** Returns the sum of the entries in the one-dimensional array arr.
     */
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /** Returns a one-dimensional array in which the entry at index k is the sum of
     * the entries of row k of the two-dimensional array arr2D.
     */
    public static int[] rowSums(int[][] arr2D) {
        int rowSum = 0;
        int[] rowSumArr = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[r].length; c++) {
                rowSum = rowSum + arr2D[r][c];
            }
            rowSumArr[r] = rowSum;
            rowSum = 0;
        }
        return rowSumArr;
    }

    /** Returns true if all rows in arr2D have different row sums;
     * false otherwise.
     */
    public static boolean isDiverse(int[][] arr2D) {
        boolean currentDiverse = true;
        int[] resultArr = rowSums(arr2D);
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = i + 1; j < resultArr.length; j++) {
                if (resultArr[i] == resultArr[j]) {
                    currentDiverse = false;
                }
            }
        }
        return currentDiverse;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                { 1, 3, 2, 7, 3 },                       // row 1
                { 10, 10, 4, 6, 2 },                     // row 2
                { 5, 3, 5, 9, 6 },                       // row 3
                { 7, 6, 4, 2, 1 }                        // row 4
        };
        int[][] mat2 = {
                { 1, 1, 5, 3, 4 },                       // row 1
                { 12, 7, 6, 1, 9 },                      // row 2
                { 8, 11, 10, 2, 5 },                     // row 3
                { 3, 2, 3, 0, 6 }                        // row 4
        };
        System.out.println("Mat1 Diverse: " + isDiverse(mat1));
        System.out.println();
        System.out.println("Mat2 Diverse: " + isDiverse(mat2));
    }

}

