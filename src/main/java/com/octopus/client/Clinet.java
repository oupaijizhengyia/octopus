package com.octopus.client;

import com.octopus.util.StreamUtil;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @FileName: Clinet
 * @Author: yeyang
 * @Date: 2020/1/16 15:31
 */
public class Clinet {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("localhost",8080));
        socket.getOutputStream().write("first".getBytes());
        socket.getOutputStream().flush();
        socket.shutdownOutput();
        System.out.println("收到服务端信息: "+StreamUtil.readStream(socket.getInputStream()));
        socket.close();
    }
}
