package chapter2_3.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * This program makes a socket connection to the atomic clock in Boulder, Colorado, and
 * prints the time that the server sends.
 * Created by Ganlee-QY on 2017/4/7.
 */
public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
            try {
                InputStream is = s.getInputStream();
                Scanner in = new Scanner(is);

                while (in.hasNextLine()) {
                    System.out.println(in.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                s.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
