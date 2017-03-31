package chapter13.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ganlee-QY on 2017/2/27.
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombinations = numbers.subList(0, 6);
        Collections.sort(winningCombinations);
        System.out.println(winningCombinations);
    }
}
