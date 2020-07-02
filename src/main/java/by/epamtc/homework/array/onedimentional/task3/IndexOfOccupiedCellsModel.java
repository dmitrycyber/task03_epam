package by.epamtc.homework.array.onedimentional.task3;

public class IndexOfOccupiedCellsModel {
    private int firstIndex;
    private int secondIndex;

    public IndexOfOccupiedCellsModel(int firstIndex, int secondIndex) {
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getSecondIndex() {
        return secondIndex;
    }

    @Override
    public String toString() {
        return "IndexOfOccupiedCellsModel{" +
                "firstIndex=" + firstIndex +
                ", secondIndex=" + secondIndex +
                '}';
    }
}
