package pack;

class Cell {
    int value;
    boolean isVisible;

    public Cell(int value, boolean isVisible) {
        this.value = value;
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return isVisible ? String.valueOf(value) : " ";
    }
}