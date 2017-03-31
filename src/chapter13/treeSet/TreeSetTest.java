package chapter13.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Ganlee-QY on 2017/2/24.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Apple", 1234));
        parts.add(new Item("Pear", 4556));
        parts.add(new Item("Banana", 9943));
        System.out.println(parts);

        SortedSet<Item> sortByDescription = new TreeSet<>(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                String des1 = o1.getDescription();
                String des2 = o2.getDescription();
                return des1.compareTo(des2);
            }
        });

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
