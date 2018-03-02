package com.company.command;

public class SimpleRemoteControl {
    Command slot;
    public void setCommand(Command command){
        slot=command;
    }
    public void buttomWasPressed(){
        slot.execute();
    }

}
