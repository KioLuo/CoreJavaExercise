package chapter1_5.abstractClasses;

/**
 * Created by Ganlee-QY on 2017/2/9.
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
