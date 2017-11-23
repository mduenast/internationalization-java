package cat.udl.tennis;

import cat.udl.tennis.game.Player;

public interface TennisGame {
    void player1WonPoint();

    void player2WonPoint();

    String getScore();

    Player getPlayer1();

    Player getPlayer2();

    void resetScores();
}