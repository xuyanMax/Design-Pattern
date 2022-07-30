package template.display;

/**
 * Created by xu on 03/02/2018.
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    //模板
    public final void display() {
        open();
        for (int i = 0; i < 5; i++)
            print();
        close();
    }
}
