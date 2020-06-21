package com.example.mazito_game.dataSource;

import com.example.mazito_game.R;
import com.example.mazito_game.modelFake.Tournament;

import java.util.ArrayList;
import java.util.List;

public class TournamentDataSource {

    public static List<Tournament> getTournamentList(){
        List<Tournament> tournaments = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            Tournament tournament = new Tournament();

            tournament.setCount(200);
            tournament.setImage(R.drawable.logo_game);
            tournament.setName("Эта турнир - " + i);
            tournament.setRaiting(4);
            tournament.setTypeTournament(Tournament.TYPE_TOURNAMENT.GOLD);
            if(i % 3 == 0){
                tournament.setTypeWins(Tournament.TYPE_WINS.PRIZER);
            } else if(i % 3 == 1){
                tournament.setTypeWins(Tournament.TYPE_WINS.WINNER);
            } else
                tournament.setTypeWins(Tournament.TYPE_WINS.UCHSTNIK);

            tournaments.add(tournament);
        }

        return tournaments;
    }

}
