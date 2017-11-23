package cat.udl.tennis.game;

import cat.udl.tennis.TennisGame;

public class TennisGameImpl implements TennisGame {

    private Player player1 = Player.PLAYER1;
    private Player player2 = Player.PLAYER2;

    public void player1WonPoint() {
        this.player1.getPlayerScore().increment();
    }

    public void player2WonPoint() {
        this.player2.getPlayerScore().increment();
    }

    public String getScore() {
        Score player1Score = player1.getPlayerScore();
        Score player2Score = player2.getPlayerScore();
        if (areTheScoresEquals(player1.getPlayerScore(), player2.getPlayerScore())) {
            return playdownPhase(player1Score);
        } else if (isScoreGreaterOrEqualThanFour(player1Score) ||
                isScoreGreaterOrEqualThanFour(player2Score)) {
            return advantatgePhase(player1Score, player2Score);
        } else {
            return normalPhase(player1Score, player2Score);
        }
    }

    private boolean areTheScoresEquals(Score player1Score, Score player2Score) {
        return player1Score.compareTo(player2Score) == 0;
    }

    private boolean isScoreZero(Score score) {
        return score.getValue() == 0;
    }

    private boolean isScoreOne(Score score) {
        return score.getValue() == 1;
    }

    private boolean isScoreTwo(Score score) {
        return score.getValue() == 2;
    }

    private boolean isScoreThree(Score score) {
        return score.getValue() == 3;
    }

    private boolean isScoreGreaterOrEqualThanFour(Score score) {
        return score.getValue() >= 4;
    }

    private String playdownPhase(Score player1Score) {
        String score = "";
        if (isScoreZero(player1Score)) {
            score = ScoreMessage.LOVE_ALL.getMessage();
        } else if (isScoreOne(player1Score)) {
            score = ScoreMessage.FIFTEEN_ALL.getMessage();
        } else if (isScoreTwo(player1Score)) {
            score = ScoreMessage.THIRTY_ALL.getMessage();
        } else {
            score = ScoreMessage.DEUCE.getMessage();
        }
        return score;
    }

    private String advantatgePhase(Score player1Score, Score player2Score) {
        String score = "";
        int minusResult = player1Score.minus(player2Score);
        if (minusResult == 1) {
            score = ScoreMessage.ADVANTAGE_PLAYER1.getMessage();
        } else if (minusResult == -1) {
            score = ScoreMessage.ADVANTAGE_PLAYER2.getMessage();
        } else if (minusResult >= 2) {
            score = ScoreMessage.WIN_FOR_PLAYER1.getMessage();
        } else {
            score = ScoreMessage.WIN_FOR_PLAYER2.getMessage();
        }
        return score;
    }

    private String normalPhase(Score player1Score, Score player2Score) {
        String score = "";

        score += getScoreMessageByScore(player1Score);
        score += "-";
        score += getScoreMessageByScore(player2Score);
        return score;
    }

    private String getScoreMessageByScore(Score playerScore) {
        String score = "";
        if (isScoreZero(playerScore)) {
            score += ScoreMessage.LOVE.getMessage();
        } else if (isScoreOne(playerScore)) {
            score += ScoreMessage.FIFTEEN.getMessage();
        } else if (isScoreTwo(playerScore)) {
            score += ScoreMessage.THIRTY.getMessage();
        } else if (isScoreThree(playerScore)) {
            score += ScoreMessage.FORTY.getMessage();
        }
        return score;
    }

    public void resetScores() {
        player1.getPlayerScore().reset();
        player2.getPlayerScore().reset();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

}
