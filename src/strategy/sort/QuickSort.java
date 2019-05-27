package strategy.sort;

/**
 * Created by xu on 03/02/2018.
 */
public class QuickSort implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        sort(data, 0, data.length-1);
    }
    public int partition(Comparable[] data, int left, int right){

        Comparable pivotKey = data[right];
        int i = left;
        for (int j=left; j<right; j++){
            if (data[j].compareTo(pivotKey) < 0){
                swap(data, i, j);
                i++;
            }
        }
        swap(data, right, i);
        return i;
    }
    public void swap(Comparable[] data, int i, int j){
        Comparable tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
    public void sort(Comparable[] data, int left, int right){
        if (left < right) {
            int partition = partition(data, left, right);
            sort(data, left, partition-1);
            sort(data, partition+1, right);
        }
    }
}
