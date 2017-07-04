package singleton;

/**
 * Created by xu on 2017/6/28.
 */
public class Summary {
}

/*
=====单件模式定义
确保一个类只有一个实例，并提供一个全局访问点
Java中实现单件模式需要一个私有构造器、一个静态方法(getInstance)、一个静态变量(UniqueInstance)

==单件模式涉及多线程方面
1、同步getInstance()方法：简单、有效，虽然同步可能造成程序执行效率下降
2、使用"急切"创建实例 (eagerly)，而不用延迟实例化的方法（lazy）
3、用"双重检查加锁"，对类加锁
*/
