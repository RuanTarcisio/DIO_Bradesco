package game;

public class SudokuGameManager {
    private SudokuBoard currentBoard;
    private final int[][] initialValues;
    private final String[][] initialVisibility;

    public SudokuGameManager(int[][] initialValues, String[][] visibility) {
        this.initialValues = initialValues;
        this.initialVisibility = visibility;
        startNewGame();
    }

    public void startNewGame() {
        currentBoard = new SudokuBoard(initialValues, initialVisibility);
    }

    public void restartGame() {
        startNewGame();
    }

    public void displayCurrentBoard() {
        currentBoard.displayBoard();
    }

    public boolean isGameComplete() {
        return currentBoard.isComplete();
    }

    public boolean addNumber(int row, int col, int value) {
        return currentBoard.addNumber(row-1, col-1, value);
    }

    public boolean removeNumber(int row, int col) {
        return currentBoard.removeNumber(row-1, col-1);
    }
}
