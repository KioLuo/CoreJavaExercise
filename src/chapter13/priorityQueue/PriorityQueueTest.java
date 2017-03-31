package chapter13.priorityQueue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * Created by Ganlee-QY on 2017/2/24.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1995, Calendar.DECEMBER, 22));
        pq.add(new GregorianCalendar(1998, Calendar.FEBRUARY, 28));
        pq.add(new GregorianCalendar(1994, Calendar.APRIL, 2));
        pq.add(new GregorianCalendar(1999, Calendar.OCTOBER, 6));

        System.out.println("Iterating elements...");
        for (GregorianCalendar date : pq) {
            System.out.println(date.get(Calendar.YEAR));
        }
        System.out.println("Removing elements...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().get(Calendar.YEAR));
        }
    }
}
