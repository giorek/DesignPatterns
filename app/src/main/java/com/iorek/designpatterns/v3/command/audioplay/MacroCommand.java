package com.iorek.designpatterns.v3.command.audioplay;

import java.util.List;

public interface MacroCommand extends AudioCommand {
     void addCommand(AudioCommand command);
     void removeCommand(AudioCommand command);
}
