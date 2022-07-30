package proxy.RMI.client;

import proxy.RMI.servor.MyRemote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 * Created by xu on 01/08/2017.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2016);

            //在RMI registry中返回stub对象
            MyRemote service = (MyRemote) registry.lookup("RemoteHello");
            //客户端调用stub方法，就像stub是真的服务对象一样
            String s = service.sayHello();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
