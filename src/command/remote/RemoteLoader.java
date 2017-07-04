package command.remote;


import command.remote.concreteCommands.*;
import command.remote.receiver.CeilingFan;
import command.remote.receiver.GarageDoor;
import command.remote.receiver.Light;
import command.remote.receiver.Stereo;

/**
 * Created by xu on 2017/6/29.
 */
public class RemoteLoader {
     public static void main(String[] args){
         RemoteControl rc = new RemoteControl();
         Light livingRoomLight = new Light("Living Room");
         Light kitchenLight = new Light("Kitchen");
         CeilingFan ceilingFan = new CeilingFan("Living Room");
         GarageDoor gd = new GarageDoor("");
         Stereo stereo = new Stereo("Living Room");


         LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
         LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
         LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
         LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

         GarageUpCommand garageUp = new GarageUpCommand(gd);
         GarageDownCommand garageDown = new GarageDownCommand(gd);

         StereoOffCommand stereoOff = new StereoOffCommand(stereo);
         StereoOnwithCDCommand stereoOnwithCDCommand = new StereoOnwithCDCommand(stereo);

         CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
         CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

         rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
         rc.setCommand(1, kitchenLightOn, kitchenLightOff);
         rc.setCommand(2, ceilingFanOn, ceilingFanOff);
         rc.setCommand(3, stereoOnwithCDCommand, stereoOff);

         System.out.println(rc);

         rc.onButtonWasPushed(0);
         rc.offButtonWasPushed(0);
         rc.onButtonWasPushed(1);
         rc.offButtonWasPushed(1);
         rc.onButtonWasPushed(2);
         rc.offButtonWasPushed(2);
         rc.onButtonWasPushed(3);
         rc.offButtonWasPushed(3);



     }
}
