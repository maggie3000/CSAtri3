/*
Maggie Killada
AP CSA 2021 FRQ #2
*/

package frq;

public class SingleTable {
private double viewQuality = 0.0;

    // default constructor
    public SingleTable(){}

    // you dont make sense
    public int getNumSeats(){
        return 5;
    }

    public int getHeight(){
        return 74;
    }

    public double getViewQuality(){
        return viewQuality;
    }

    public void setViewQuality(double value){
        viewQuality = value;
    }

}
