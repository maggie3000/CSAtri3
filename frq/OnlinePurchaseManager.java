/*
Maggie Killada
AP CSA 2020 Sample Questions FRQ #1
*/

package frq;
import java.util.ArrayList;

public class OnlinePurchaseManager {
    /** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
    private ArrayList<Gizmo> purchases;


    /** Returns the number of purchased Gizmo objects that are electronic and are
     * manufactured by maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker) {
        int count = 0;
        for(int i = 0; i < purchases.size(); i++){
            if (purchases.get(i).getMaker() == maker && purchases.get(i).isElectronic() == true){
                count++;
            }
        }
        return count;
    }


    /** Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and
     * false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair() {
        for(int i = 0; i < purchases.size() - 1; i++){
            if (purchases.get(i).equals(purchases.get(i+1)) == true){
                return true;
            }
        }
        return false;
    }
    // There may be instance variables, constructors, and methods not shown.

    /*  "method for getting cheapest gizmo by maker"
    public Gizmo getCheapestGizmoByMaker(String maker){
        "this method will use a for loop to look through the purchases and get the value of the Gizmo,
        then it will set the 'cheapest' gizmo to a variable called 'cheapest'. Then it will compare the remaining
        purchases to the 'cheapest' and if it is less than, it will set the 'cheapest' to the value of the index."
    }
     */

}