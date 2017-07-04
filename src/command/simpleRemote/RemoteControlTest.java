package command.simpleRemote;

/**
 * Created by xu on 2017/6/29.
 */

/*命令模式的客户端*/
public class RemoteControlTest {
     public static void main(String[] args){
         Light light = new Light();
         GarageDoor garage = new GarageDoor();
         Command lightOn = new LightOnCommand(light);
         Command lightOff = new LightOffCommand(light);
         Command garageOpen = new GarageOpenCommand(garage);
//
//         lightOn.execute();
//         lightOff.execute();
//         garageOpen.execute();
         SimpleRemoteControl rc = new SimpleRemoteControl();
         rc.setCommand(lightOn);//命令传递给调用者
         rc.buttonPressed();//模拟按下按钮，调用请求接受者的方法

         rc.setCommand(lightOff);
         rc.buttonPressed();

         rc.setCommand(garageOpen);
         rc.buttonPressed();

     }
}
