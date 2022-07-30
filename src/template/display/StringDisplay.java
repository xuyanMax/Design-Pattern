package template.display;

/**
 * Created by xu on 03/02/2018.
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++)
            System.out.print("-");
        System.out.println("+");
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
