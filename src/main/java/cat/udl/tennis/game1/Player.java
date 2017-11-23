package cat.udl.tennis.game1;

public enum Player {
    PLAYER1("player1"), PLAYER2("player2");

    private String playerName;

    private Score playerScore;

    Player(String playerName) {
        this.playerName = playerName;
        this.playerScore = new Score();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Score getPlayerScore() {
        return playerScore;
    }


}
