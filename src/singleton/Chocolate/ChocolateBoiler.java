package singleton.Chocolate;

/**
 * Created by xu on 2017/6/28.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    /*利用一个静态变量来记录Singleton类的唯一实例变量*/
    private static ChocolateBoiler uniqueInstance;

    /*构造器声明为私有，只有自Singleton类类内才可以调用构造器*/
    private ChocolateBoiler() {
        empty = false;
        boiled = false;
    }

    /*getInstance()方法实例化对象，并返回*/
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    /*其他方法*/

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }

    }

    public void drain() {
        if (!isEmpty() && isBoiled())
            empty = true;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled())
            boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
