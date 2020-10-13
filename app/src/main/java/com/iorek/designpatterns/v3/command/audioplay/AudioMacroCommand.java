package com.iorek.designpatterns.v3.command.audioplay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AudioMacroCommand implements MacroCommand {
    private  List<AudioCommand> commandList;

    public AudioMacroCommand(){
        commandList = new ArrayList<>();
    }

    @Override
    public void addCommand(AudioCommand command) {
        if(!commandList.contains(command)){
            commandList.add(command);
        }
    }

    @Override
    public void removeCommand(AudioCommand command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        Iterator<AudioCommand> iterator =  commandList.iterator();
        while (iterator.hasNext()){
            iterator.next().execute();
        }
    }
}
