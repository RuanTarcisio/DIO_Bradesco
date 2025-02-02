package pack;

public class Game {
    private int[][] initialValues;
    private boolean[][] initialVisibility;

    public Game() {
    }

    public Game(int[][] initialValues, boolean[][] initialVisibility) {
        this.initialValues = initialValues;
        this.initialVisibility = initialVisibility;
    }

    public int[][] getInitialValues() {
        return initialValues;
    }

    public void setInitialValues(int[][] initialValues) {
        this.initialValues = initialValues;
    }

    public boolean[][] getInitialVisibility() {
        return initialVisibility;
    }

    public void setInitialVisibility(boolean[][] initialVisibility) {
        this.initialVisibility = initialVisibility;
    }
}
