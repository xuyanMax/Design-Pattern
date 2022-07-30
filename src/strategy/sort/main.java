package strategy.sort;

import java.util.Random;

/**
 * Created by xu on 03/02/2018.
 */
public class main {
    public static void main(String[] args) {
        String[] data = {
                "Donald Trump", "Bowman", "Carroll", "Elfland", "Alice"
        };
        SortPrint sap = new SortPrint(data, new SelectionSort());
        sap.execute();
        sap = new SortPrint(data, new QuickSort());
        shuffle(data);
        sap.execute();
    }

    public static void shuffle(Comparable[] data) {
        Random r = new Random();
        for (int i = data.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            swap(data, index, i);
        }
    }

    public static void swap(Comparable[] data, int i, int j) {
        Comparable tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
