package com.mq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : yyc
 * @date : 2019-11-11
 */
public class BrokerServer implements Runnable {

    public static int SERVICE_PORT = 9999;

    private final Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        BufferedReader in = null;

        PrintWriter out = null;

        try {

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(socket.getOutputStream());

            while (true) {
                String s = in.readLine();
                if (s == null) {
                    continue;
                }
                System.out.println("收到的原始数据：" + s);

                if (s.equals("CONSUME")) {

                    Broker.consume();
                    out.println(s);
                    out.flush();
                } else {
                    Broker.produce(s);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.close();
        }

    }

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(SERVICE_PORT);

        while (true) {
            BrokerServer brokerServer = new BrokerServer(serverSocket.accept());
            new Thread(brokerServer).start();
        }

    }
}
