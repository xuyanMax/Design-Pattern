package state.alarm;

/**
 * Created by xu on 03/02/2018.
 */
public class Main {
     public static void main(String[] args){
           SafeFrame inst = new SafeFrame("State");
           while (true){
               for (int h=0; h<24; h++){
                   inst.setClock(h);//更改context中state
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
     }
}
