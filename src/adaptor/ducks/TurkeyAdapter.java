package adaptor.ducks;

/**
 * Created by xu on 2017/7/3.
 */
public class TurkeyAdapter implements Duck {//你需要实现你想转换成的类型接口
    //组合对象
    Turkey turkey;

    /*通过构造器取得想要取得要适配的对象引用*/
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /*调用被适配者的gobble方法*/
    @Override
    public void quack() {
        turkey.gobble();
    }
    /*火鸡可以短距离飞行，不像鸭子。要让鸭子和火鸡的飞行能够对应，需要连续五次调用火鸡的fly方法*/
    @Override
    public void fly() {
        for (int i=0; i<5; i++)
            turkey.fly();
    }
}
