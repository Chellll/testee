package com.example.mazito_game.dataSource;

import com.example.mazito_game.R;

import java.util.ArrayList;
import java.util.List;

public class Progress {

    public static List<com.example.mazito_game.modelFake.Progress> getListProgress(){
        List<com.example.mazito_game.modelFake.Progress> progresses = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            com.example.mazito_game.modelFake.Progress progress = new com.example.mazito_game.modelFake.Progress();

            progress.setImage(R.drawable.ic_zvezda);
            progress.setDescription("Вход в игру");
            progress.setCheckUse(5);
            progress.setCheckItog(12);

            progresses.add(progress);
        }

        return progresses;
    }

}
