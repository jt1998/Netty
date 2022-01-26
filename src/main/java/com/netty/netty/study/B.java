package com.netty.netty.study;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 姜涛
 * @create 2022-01-24 14:01
 */
public class B{
    private String address;
    private String gender;

    public B() {
        System.out.println("我是子类的构造器....");
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "B{" +
                "address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


    public B(String address, String gender) {
        this.address = address;
        this.gender = gender;
    }


    public static void main(String[] args) throws Exception {
        try {
            ExecutorService service = Executors.newFixedThreadPool(10);
            A a = new A("姜涛");
            int b = 10/0;
            service.execute(a);
        }catch (Exception e){
            throw new Exception("线程异常....");
        }

    }

}
