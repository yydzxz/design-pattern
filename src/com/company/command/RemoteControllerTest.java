package com.company.command;

public class RemoteControllerTest {
    public static void main(String[] args) {

        SimpleRemoteControl remoteControl=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttomWasPressed();
    }


}
