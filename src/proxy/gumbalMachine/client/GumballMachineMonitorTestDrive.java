package proxy.gumbalMachine.client;

import proxy.gumbalMachine.servor.GumballMachine;
import proxy.gumbalMachine.servor.GumballMachineRemote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by xu on 01/08/2017.
 */
public class GumballMachineMonitorTestDrive {
     public static void main(String[] args){
         try {
             Registry registry = LocateRegistry.getRegistry("localhost", 2016);

             GumballMachineRemote gumballMachine = (GumballMachineRemote) registry.lookup("gumball machine");
             GumballMachineMonitor monitor = new GumballMachineMonitor(gumballMachine);
             monitor.report();
         } catch (RemoteException e) {
             e.printStackTrace();
         } catch (NotBoundException e) {
             e.printStackTrace();
         }
     }
}
