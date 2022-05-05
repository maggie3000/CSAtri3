/*
Maggie Killada
AP CSA 2015 FRQ #3
*/

package frq;

public class HiddenWord {
    private String WOD = ""; // bears
    private String[] WODarr = {};


    public HiddenWord(String word) {
        WOD = word;
        WODarr = new String[WOD.length()]; // initialize the array with the declaring the length
        for (int i = 0; i < WOD.length() - 1; i++) {
            WODarr[i] = WOD.substring(i, i + 1);
        }
    }

    public String getHint(String guess) {
        String result = "";
        String[] guessArr = new String[guess.length()];
        for (int i = 0; i < guess.length() - 1; i++) {
            guessArr[i] = guess.substring(i, i + 1);
        }
        for (int k = 0; k < guess.length(); k++)
        {
            if (guessArr[k] == WODarr[k]){
                result = result + guessArr[k];
            }
            else if (guess.indexOf(WODarr[k]) != -1){
                result += "+";
            }
            else {
                result += "*";
            }
        }
        return result;
    }


}
