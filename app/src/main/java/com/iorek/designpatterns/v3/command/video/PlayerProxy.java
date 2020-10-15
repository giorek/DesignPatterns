package com.iorek.designpatterns.v3.command.video;


import java.util.ArrayList;
import java.util.List;

public class PlayerProxy {
    private List<IPlayer> commandList = new ArrayList<>();

    public PlayerProxy(){

    }

    public boolean addPlayer(IPlayer player){
        boolean result = false;
        if(!commandList.contains(player)){
            commandList.add(player);
            result = true;
        }
        return result;
    }

    public void run(){
        for(IPlayer player : commandList){
            player.play();
        }
    }
}
