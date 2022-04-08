import java.util.ArrayList;

// Java program for implementation of Bubble Sort
public class BubbleSort extends Sort {

       public void SortData(ArrayList<Integer> data) {
        int n = data.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (data.get(j) > data.get(j+1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                }
    }
}