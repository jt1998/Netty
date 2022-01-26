package com.netty.netty.study;

/**
 * @author 姜涛
 * @create 2022-01-24 14:00
 */
/*父类*/
public class A extends Thread{
    private String name;
    public A(String name){
        this.name = name;
    }    @Override
    public void run() {
        System.out.println("这是线程 " + name);
    }
}
