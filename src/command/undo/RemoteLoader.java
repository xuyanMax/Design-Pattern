package command.undo;

import command.undo.concreteCommands.*;
import command.undo.receiver.CeilingFan;
import command.undo.receiver.Light;

/**
 * Created by xu on 2017/6/30.
 */
public class RemoteLoader {
     public static void main(String[] args){
         RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();


         Light livingRoomLight = new Light("Living Room");

         /*实例化两个台灯命令*/
         LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
         LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

         /*将电灯命令设置到控制器的0号插槽*/
         remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
         remoteControl.onButtonWasPushed(0);//打开
         remoteControl.offButtonWasPushed(0);//关闭
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();// 撤销


         remoteControl.offButtonWasPushed(0);//关闭
         remoteControl.onButtonWasPushed(0);//打开
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();//撤销

         CeilingFan ceilingFan = new CeilingFan("Living Room");

         /*实例化三个吊扇命令*/
         CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
         CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
         CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

         remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
         remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

         remoteControl.onButtonWasPushed(0);//中速打开
         remoteControl.offButtonWasPushed(0);//关闭
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();//撤销，应该回到中速

         remoteControl.onButtonWasPushed(1);//高速打开
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();//撤销，应该回到中速
     }
}
