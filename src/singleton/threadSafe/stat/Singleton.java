package singleton.threadSafe.stat;

/**
 * Created by xu on 2017/6/28.
 */
public class Singleton {
    /*在静态初始化器中创建单件，这段代码保证了线程安全*/
    /*利用这个做法，我们依赖JVM在加载这个类的时候马上创建此类唯一的单件实例
    * JVM保证在任何线程访问uniqueInstance静态变量之前，一定先创建实例。
    * */
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {};

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
