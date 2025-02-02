package pack;

class SudokuBoard {
    private final Cell[][] board;

    public SudokuBoard(int[][] initialValues, boolean[][] visibility) {
        board = new Cell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = new Cell(initialValues[i][j], visibility[i][j]);
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!board[i][j].isVisible) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean addNumber(int row, int col, int value) {
        if (validateNumber(row, col, value)) {
            if (!board[row][col].isVisible) {
                board[row][col].value = value;
                board[row][col].isVisible = true;
                return true;
            }
        }
        return false;
    }

    public boolean removeNumber(int row, int col) {
        if (board[row][col].isVisible) {
            board[row][col].isVisible = false;
            return true;
        }
        return false;
    }

    private boolean validateNumber(int row, int col, int value) {

        int valueActual;

       for (int i = 0; i < 9; i++) {
            valueActual = board[row][i].value;
            if (valueActual == value)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            valueActual = board[i][col].value;
            if (valueActual == value)
                return false;
        }
        return true;
    }
}