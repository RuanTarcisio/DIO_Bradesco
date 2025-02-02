package game;

public class Cell {
    int value;
    String status;

    public Cell(int value, String isVisible) {
        this.value = value;
        this.status = isVisible;
    }

    @Override
    public String toString() {
        return CellConstants.EMPTY.equals(status) ? " " : String.valueOf(value);
    }
}