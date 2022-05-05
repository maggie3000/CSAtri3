/*
Maggie Killada
AP CSA 2021 FRQ #2
*/

package frq;

public class CombinedTable {
    SingleTable t1;
    SingleTable t2;

    public CombinedTable(SingleTable table1, SingleTable table2){
        t1 = table1;
        t2 = table2;
    }

    public boolean canSeat(int seats){
        return seats <= (t1.getNumSeats() + t2.getNumSeats() - 2);
    }

    public double getDesirability(){
        return (t1.getViewQuality() + t2.getViewQuality()) / 2;
    }
}
