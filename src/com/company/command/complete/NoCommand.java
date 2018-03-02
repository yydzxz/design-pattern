package com.company.command.complete;

import com.company.command.Command;

/**
 * 作为空对象
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("noCommand execute");
    }

    @Override
    public void undo() {
        System.out.println("noCommand undo");
    }
}
