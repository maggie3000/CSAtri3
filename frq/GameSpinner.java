/*
Maggie Killada
AP CSA 2020 FRQ #2
*/

package frq;

public class GameSpinner {
private int sector;
private int previousSpin = 0;
private int currentLength = 1;

    public GameSpinner(int s){
         sector = s;
    }

    public int currentRun(){
        return currentLength;
    }

    public int spin(){
        int currentSpin = 1 + (int) Math.random() * sector;
        if (currentSpin == previousSpin){
            currentLength++;
        }
        else {
            previousSpin = currentSpin;
            currentLength = 1;
        }
        return currentSpin;
    }

}
