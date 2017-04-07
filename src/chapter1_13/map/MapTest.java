package chapter1_13.map;

import chapter1_5.abstractClasses.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ganlee-QY on 2017/2/24.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("12-22-33", new Employee("Harry", 1999, 1999, 12, 2));
        staff.put("12-22-55", new Employee("John", 2000, 2000, 12, 2));
        staff.put("12-22-66", new Employee("Maris", 2001, 2001, 12, 2));
        staff.put("12-22-77", new Employee("Jim", 2002, 2002, 12, 2));

        System.out.println(staff);

        staff.remove("12-22-55");
        staff.put("12-22-77", new Employee("Jack", 2111, 2010, 12, 22));
        System.out.println(staff.get("12-22-66"));

        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("key=" + key + ",value=" + value);
        }

    }
}
