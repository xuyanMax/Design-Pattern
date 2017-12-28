package proxy.gumbalMachine.servor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xu on 01/08/2017.
 */
//为GumballMachine创建远程接口，该接口提供一组可以远程调用的方法
//必须确定该接口的所有返回类型都是"可序列化的";
//所有返回类型必须是 原语类型或可序列化类型
public interface GumballMachineRemote extends Remote{
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
