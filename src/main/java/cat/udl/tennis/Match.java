package cat.udl.tennis;

import cat.udl.tennis.game.Player;
import cat.udl.tennis.game.ScoreMessage;
import cat.udl.tennis.game.TennisGameImpl;

import java.util.Scanner;
import java.util.logging.Logger;

public class Match {
    private static final Logger LOGGER = Logger.getLogger(Match.class.getName());
    private TennisGame tennisGame = new TennisGameImpl();

    public static void main(String[] args) {
        Match match = new Match();
        String markerPlayer;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to mytennis");
        System.out.println("Player 1 name:");
        match.getPlayerName(match.tennisGame.getPlayer1(), in);
        System.out.println("Player 2 name:");
        match.getPlayerName(match.tennisGame.getPlayer2(), in);
        do {
            System.out.println("Who scores?"
                    + "("
                    + match.tennisGame.getPlayer1().getPlayerName()
                    + "/"
                    + match.tennisGame.getPlayer2().getPlayerName() + ")");
            markerPlayer = in.nextLine().trim();
            if (markerPlayer.equals(match.tennisGame.getPlayer1().getPlayerName())) {
                match.tennisGame.player1WonPoint();
            } else if (markerPlayer.equals(match.tennisGame.getPlayer2().getPlayerName())) {
                match.tennisGame.player2WonPoint();
            }
            System.out.println(match.tennisGame.getScore());
        }
        while (!match.tennisGame.getScore().equals(ScoreMessage.WIN_FOR_PLAYER1.getMessage())
                && !match.tennisGame.getScore().equals(ScoreMessage.WIN_FOR_PLAYER2.getMessage()));
    }

    private void getPlayerName(Player player, Scanner in) {
        String playerName;
        do {
            playerName = in.nextLine().trim();
        } while (playerName.length() == 0);
        player.setPlayerName(playerName);
    }
}
