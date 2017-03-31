package chapter14.unsynch;

/**
 * Created by Ganlee-QY on 2017/3/1.
 */
public class TransferRunnable implements Runnable{
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank b, int from, double maxAmount) {
        bank = b;
        fromAccount = from;
        this.maxAmount = maxAmount;
    }

    public void run() {
        try {
            while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
