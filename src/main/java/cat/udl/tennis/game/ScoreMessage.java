package cat.udl.tennis.game;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ScoreMessage {
    LOVE_ALL("love.all"),
    FIFTEEN_ALL("fifteen.all"),
    THIRTY_ALL("thirty.all"),
    DEUCE("deuce"),
    ADVANTAGE_PLAYER1("advantage.player1"),
    ADVANTAGE_PLAYER2("advantage.player2"),
    WIN_FOR_PLAYER1("win.for.player1"),
    WIN_FOR_PLAYER2("win.for.player2"),
    LOVE("love"),
    FIFTEEN("fifteen"),
    THIRTY("thirty"),
    FORTY("forty");
    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("resourcesBundle", Locale.getDefault());
    private final String message;

    ScoreMessage(String message) {
        this.message = resourceBundle.getString(message);
    }

    public String getMessage() {
        return message;
    }
}
