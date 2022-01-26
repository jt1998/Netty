package com.netty.netty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 姜涛
 * @create 2022-01-17 17:06
 */
@RestController
@RequestMapping("/netty")
public class NettyController {

    @GetMapping("/msg")
    public void nettyDataReciver(String data){
        try {
//            Socket client = new Socket("localhost",8888);
//            OutputStream outputStream = client.getOutputStream();
//            PrintWriter writer = new PrintWriter(outputStream);
//            writer.write(data + "...");
//            writer.flush();
//            client.shutdownOutput();
//            client.close();
//            AtomicInteger atomicInteger = new AtomicInteger(0);
//            for (int i = 1; i<= 100; i++){
//                atomicInteger.getAndIncrement();
//            }
//            System.out.println(atomicInteger);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
