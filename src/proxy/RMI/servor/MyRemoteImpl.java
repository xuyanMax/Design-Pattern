package proxy.RMI.servor;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by xu on 01/08/2017.
 */
//制作远程实现
//想要创建一个远程对象（服务），扩展UnicastRemoteObject是最容易的方法
//设计一个不带变量的构造器，并声明RemoteException
//必须实现MyRemote远程接口
//用RMI registry注册此服务

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    //你的超类UnicastRemoteObject构造器声明了异常，所以你必须写一个构造器，因为这意味着你的构造器正在调用不安全的代码（它的超构造器）
    public MyRemoteImpl() throws RemoteException {
    }
    public static void main(String[] args){
        try {

            MyRemote service = new MyRemoteImpl();//先产生远程对象
            Registry registry = LocateRegistry.createRegistry(2016);
            registry.rebind("RemoteHello", service);//再绑定到rmiregistry，客户将使用你注册的名称在rmi registry中寻找它
            System.out.println("In service");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
