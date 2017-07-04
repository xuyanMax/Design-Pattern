package singleton.threadSafe.dcl;

/**
 * Created by xu on 2017/6/28.
 */
/*double-check-lock*/
public class Singleton {
    /*首先检查实例是否已经创建，如果未创建，"才"同步，这样，只有第一次会同步（只同步一次），而这正式我们想要的*/
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
