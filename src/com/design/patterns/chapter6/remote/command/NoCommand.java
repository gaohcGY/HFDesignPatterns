package com.design.patterns.chapter6.remote.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Here is no command");
    }

    @Override
    public void undo() {
        System.out.println("Here is no command of undo");
    }
}
