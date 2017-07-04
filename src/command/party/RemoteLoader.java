package command.party;

import command.party.concreteCommands.*;
import command.party.receiver.Hottub;
import command.party.receiver.Light;
import command.party.receiver.Stereo;
import command.party.receiver.TV;

/**
 * Created by xu on 2017/6/30.
 */
public class RemoteLoader {
     public static void main(String[] args){
         /*使用宏命令  Macro Commands*/

         RemoteControl remoteControl = new RemoteControl();

         /*1、创建想要进入宏命令的对象 （电灯、电视、音响、热水器）*/
         Light light = new Light("Living Room");
         TV tv = new TV("Living Room");
         Stereo stereo = new Stereo("Living Room");
         Hottub hottub = new Hottub();

         LightOnCommand lightOn = new LightOnCommand(light);
         StereoOnCommand stereoOn = new StereoOnCommand(stereo);
         TVOnCommand tvOn = new TVOnCommand(tv);
         HottubOnCommand hottubOn = new HottubOnCommand(hottub);
         LightOffCommand lightOff = new LightOffCommand(light);
         StereoOffCommand stereoOff = new StereoOffCommand(stereo);
         TVOffCommand tvOff = new TVOffCommand(tv);
         HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        /*2、创建两个数组，其中一个用于记录开启命令， 另一个用来记录关闭命令，并在数组内放入对应的命令*/
        Command[] partyOn = new Command[]{lightOn, stereoOn, hottubOn, tvOn};
        Command[] partyOff = new Command[]{lightOff, stereoOff, hottubOff, tvOff};

        MacroCommand macroCommandOn = new MacroCommand(partyOn);
        MacroCommand macroCommandOff = new MacroCommand(partyOff);

        /*3、将宏命令指定给我们所希望的按钮*/
        remoteControl.setCommand(0, macroCommandOn, macroCommandOff);
        /*4、按下按钮*/
         System.out.println(remoteControl);
         System.out.println("----------pushing macro on------------");
         remoteControl.onButtonWasPushed(0);
         System.out.println("----------pushing macro off------------");
         remoteControl.offButtonWasPushed(0);
         System.out.println("----------pushing macro undo------------");
         remoteControl.undoButtonWasPushed();


     }
}
