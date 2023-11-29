package com.example.gulimall.product;

import com.google.gson.Gson;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

@Data
public class HelloWorld {
    private static Gson gson = new Gson();
    private volatile static HelloWorld hello;

    private HelloWorld() {}

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
        Private p = Private.getInstance();
        System.out.println(p);
        String json = gson.toJson(p);
        Private aPrivate = gson.fromJson(json, Private.class);
        System.out.println(aPrivate);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> future =  executorService.submit(new Task());
        future.get();
        final int a;
        a = 5;
        executorService.execute(new Task());
        executorService.shutdown();
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

@Slf4j
class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("进入了task方法！！！");
        int a = 1 / 0;
        System.out.println("task方法结束");

    }
}
