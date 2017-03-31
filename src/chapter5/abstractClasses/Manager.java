package chapter5.abstractClasses;

/**
 * Created by Ganlee-QY on 2017/2/22.
 */
public class Manager extends Employee {
    private int Bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        Bonus = 0;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }
}
