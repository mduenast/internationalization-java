package cat.udl.tennis.game1;

public enum ScoreMessage {
    LOVE_ALL("Love-All"),
    FIFTEEN_ALL("Fifteen-All"),
    THIRTY_ALL("Thirty-All"),
    DEUCE("Deuce"),
    ADVANTAGE_PLAYER1("Advantage player1"),
    ADVANTAGE_PLAYER2("Advantage player2"),
    WIN_FOR_PLAYER1("Win for player1"),
    WIN_FOR_PLAYER2("Win for player2"),
    LOVE("Love"),
    FIFTEEN("Fifteen"),
    THIRTY("Thirty"),
    FORTY("Forty");

    private final String message;

    ScoreMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
