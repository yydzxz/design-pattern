package com.company.command.complete;

import com.company.command.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        this.onCommands=new Command[7];
        this.offCommands = new Command[7];
        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n---------Remote Control-----------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getName()
                    +"     "+offCommands.getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }

}
