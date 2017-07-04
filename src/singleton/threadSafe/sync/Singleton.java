package singleton.threadSafe.sync;

/**
 * Created by xu on 2017/6/28.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {}

    synchronized public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }
    // other useful methods here
}
