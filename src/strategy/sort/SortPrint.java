package strategy.sort;

/**
 * Created by xu on 03/02/2018.
 */
public class SortPrint {
    Comparable[] data;
    Sorter sorter;

    public SortPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    //算法框架
    public void execute(){
        print();
        sorter.sort(data);
        print();
    }
    public void print(){
        for (Comparable c:data)
            System.out.print(c+" ");
        System.out.println("");
    }
}
