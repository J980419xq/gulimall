package com.example.gulimall.product;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.proxy.Enhancer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

@Data
public class HelloWorld {
    private volatile static HelloWorld hello;

    private HelloWorld(){

    }
    private static HelloWorld getInstance() {
        if (hello == null) {
            synchronized (HelloWorld.class) {
                if (hello == null) {
                    hello = new HelloWorld();
                }
            }
        }
        return hello;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> future =  executorService.submit(new Task());
        future.get();
        executorService.execute(new Task());
    }



    @Data
    static class Student implements Cloneable{
        @Setter
        private int age;
        private String name;
        private Lover love;
        Student() {

        }
        Student(int age, String name, Lover love) {
            this.age = age;
            this.name = name;
            this.love = love;
        }

        @Override
        public Student clone() {
            try {
                Student clone = (Student) super.clone();
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Lover {
        private int age;
        private String name;
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("进入了task方法！！！");
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println("捕获异常");
        }
    }
}
