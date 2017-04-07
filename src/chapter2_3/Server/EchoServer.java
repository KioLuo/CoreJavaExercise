package chapter2_3.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * This program implements a simple server that listens to port 8189 and echos back all client input.
 * Created by Ganlee-QY on 2017/4/7.
 */
public class EchoServer {
    public static void main(String[] args) {
        try {
            // establish server socket
            ServerSocket s = new ServerSocket(8189);

            // wait for client connection
            Socket incoming = s.accept();
            try {
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();

                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream, true);

                out.println("Hello! Enter BYE to exit.");

                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    out.println("echo: " + line);
                    if (line.trim().equals("BYE")) {
                        done = true;
                    }
                }

            } finally {
                incoming.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
