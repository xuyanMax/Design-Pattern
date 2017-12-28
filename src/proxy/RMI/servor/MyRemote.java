package proxy.RMI.servor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xu on 01/08/2017.
 */
//制作远程接口
//所有的远程方法必须声明 RemoteException

public interface MyRemote extends Remote {
    //所有返回类型必须是原语类型或者是可序列化类型
    public String sayHello() throws RemoteException;
}
