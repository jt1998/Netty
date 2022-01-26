package com.netty.netty.handler.client;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author 姜涛
 * @create 2022-01-17 16:56
 */


/*netty客户端*/
public class NettyClient {
    public static void main(String[] args) {
       try {
           Socket client = new Socket("localhost",8888);
           OutputStream outputStream = client.getOutputStream();
           PrintWriter writer = new PrintWriter(outputStream);
           writer.write("希望今年回家之后还能安安稳稳的回来上班...");
           writer.flush();
           client.shutdownOutput();
           client.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
