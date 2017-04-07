package chapter1_13.treeSet;

import java.util.Objects;

/**
 * Created by Ganlee-QY on 2017/2/24.
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    @Override
    public String toString() {
        return "[description = " + description + " ,partNumber = " + partNumber + "]";
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(partNumber, other.partNumber);
    }
}
