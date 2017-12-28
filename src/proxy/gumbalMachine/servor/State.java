package proxy.gumbalMachine.servor;

import java.io.Serializable;

/**
 * Created by xu on 01/08/2017.
 */
public interface State extends Serializable{//只要扩展Serializable，现在有所子类中的State就可以在网络上传送了
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
