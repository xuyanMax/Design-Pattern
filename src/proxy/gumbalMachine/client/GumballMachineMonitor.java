package proxy.gumbalMachine.client;

import proxy.gumbalMachine.servor.GumballMachine;
import proxy.gumbalMachine.servor.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * Created by xu on 01/08/2017.
 */
public class GumballMachineMonitor {
    GumballMachineRemote machine;

    //依赖远程接口
    public GumballMachineMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }
    public void report() {
        try {
            System.out.println("Gumball Machine: "+machine.getLocation());
            System.out.println("Gumball Inventory:"+machine.getCount() + " gumballs");
            System.out.println("Gumball State: "+machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
