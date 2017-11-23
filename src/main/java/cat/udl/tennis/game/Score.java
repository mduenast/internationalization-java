package cat.udl.tennis.game;

public class Score implements Comparable<Score> {
    private int value;

    public Score() {
        this.value = 0;
    }

    public void increment() {
        this.value++;
    }

    public void reset() {
        this.value = 0;
    }

    public int minus(Score score) {
        return this.value - score.value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(Score score) {
        return this.value - score.value;
    }
}
