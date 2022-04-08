import java.util.ArrayList;

// Java program for implementation of Insertion Sort
public class InsertionSort extends Sort {

    public void SortData(ArrayList<Integer> data) {
        int n = data.size();
        for (int i = 1; i < n; ++i) {
            int key = data.get(i);
            int j = i - 1;

            // move elements greater than key one postition ahead
            while (j >= 0 && data.get(j) > key) {
                data.set(j + 1, data.get(j));
                j = j - 1;
            }
            data.set(j + 1, key);
        }
    }
}

