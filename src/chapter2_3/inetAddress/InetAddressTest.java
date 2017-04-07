package chapter2_3.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ganlee-QY on 2017/4/7.
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                String host = args[0];
                InetAddress[] addresses = InetAddress.getAllByName(host);
                for (InetAddress address : addresses) {
                    System.out.println(address);
                }
            } else {
                InetAddress address = InetAddress.getLocalHost();
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
