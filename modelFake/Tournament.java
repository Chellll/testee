package com.example.mazito_game.modelFake;

public class Tournament {

    public enum TYPE_TOURNAMENT{
        BRONZA,
        SEREBRO,
        GOLD
    }

    public enum TYPE_WINS{
        UCHSTNIK,
        PRIZER,
        WINNER
    }

    private Integer image;
    private String name;
    private TYPE_TOURNAMENT typeTournament;
    private TYPE_WINS typeWins;
    private Integer count;
    private Integer raiting;

    public Tournament(){}

    public Tournament(Integer image, String name, TYPE_TOURNAMENT typeTournament, TYPE_WINS typeWins, Integer count, Integer raiting) {
        this.image = image;
        this.name = name;
        this.typeTournament = typeTournament;
        this.typeWins = typeWins;
        this.count = count;
        this.raiting = raiting;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeTournament() {
        return typeTournament.toString();
    }

    public void setTypeTournament(TYPE_TOURNAMENT typeTournament) {
        this.typeTournament = typeTournament;
    }

    public String getTypeWins() {
        return typeWins.toString();
    }

    public void setTypeWins(TYPE_WINS typeWins) {
        this.typeWins = typeWins;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRaiting() {
        return raiting;
    }

    public void setRaiting(Integer raiting) {
        this.raiting = raiting;
    }
}
