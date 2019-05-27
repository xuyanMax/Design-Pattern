package strategy.sort;

/**
 * Created by xu on 03/02/2018.
 */
public class SelectionSort implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for (int i=0; i<data.length-1; i++){
            int min = i;
            for(int j=i+1; j<data.length; j++){
                if (data[j].compareTo(data[min]) < 0){
                    min = j;
                }
            }
            if (min != i)
                swap(data, min, i);
        }
    }
    public void swap(Comparable[] data, int i, int j){
        Comparable tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
