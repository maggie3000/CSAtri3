import java.util.ArrayList;

// Java program for implementation of Merge Sort
public class SelectionSort extends Sort {

    public void SortData(ArrayList<Integer> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = 0; j < n - 1; j++) {
                if (data.get(min) < data.get(j)) {
                    min = j; // swap
                    data.set(j, data.get(j + 1));
                    // swap minimum value with the first value
                    int temp = data.get(min);
                    data.set(min, i);
                    data.set(i, temp);
                }
            }
        }
    }
}