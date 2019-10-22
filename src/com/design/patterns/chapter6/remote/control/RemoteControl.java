package com.design.patterns.chapter6.remote.control;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.command.NoCommand;

public class RemoteControl {

    Command onCommands[];
    Command offCommands[];

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCmmand, Command offCommand) {
        if (slot >= onCommands.length || slot >= offCommands.length) {
            System.out.println("Slot is Error!");
            return;
        }
        onCommands[slot] = onCmmand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (slot < onCommands.length) {
            onCommands[slot].execute();
        }
    }

    public void offButtonWasPushed(int slot) {
        if (slot < offCommands.length) {
            offCommands[slot].execute();
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot + ");
            stringBuffer.append(i);
            stringBuffer.append("]");
            stringBuffer.append(onCommands[i].getClass().getName());
            stringBuffer.append("\t");
            stringBuffer.append(offCommands[i].getClass().getName());
            stringBuffer.append("\n");
        }

        return stringBuffer.toString();
    }
}
