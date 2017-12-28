package proxy.gumbalMachine.servor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by xu on 01/08/2017.
 */
public class GumballMachineTestDrive {
     public static void main(String[] args){
         GumballMachineRemote gumballMachine = null;
         int count;
//         if (args.length < 2){
//             System.out.println("GumballMachine <name> <inventory>");
//             System.exit(1);
//         }
         try {
             count = 10;
             gumballMachine = new GumballMachine("loc", count);
             Registry registry = LocateRegistry.createRegistry(2016);
             registry.rebind("gumball machine",gumballMachine);
             System.out.println("In service");
         } catch (RemoteException e) {
             e.printStackTrace();
         }
     }
}
