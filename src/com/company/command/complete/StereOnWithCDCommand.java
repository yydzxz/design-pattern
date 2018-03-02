package com.company.command.complete;

import com.company.command.Command;

public class StereOnWithCDCommand implements Command {
    Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();;
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        System.out.println("StereOnWithCDCommand undo");
    }
}
