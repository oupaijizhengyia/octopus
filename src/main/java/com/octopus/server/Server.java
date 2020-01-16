package com.octopus.server;

import com.octopus.util.StreamUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @FileName: Server
 * @Author: yeyang
 * @Date: 2020/1/16 15:23
 */

public class Server implements Runnable {

    public void run() {
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("服务端已开启");
            Socket accept;
            while (true){
                accept = server.accept();
                InputStream inputStream = accept.getInputStream();
                String in = StreamUtil.readStream(inputStream);
                System.out.println("收到客户端信息"+in);
                accept.getOutputStream().write("hello world".getBytes());
                accept.getOutputStream().flush();
                accept.shutdownOutput();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
