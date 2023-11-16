package com.example.gulimall.product;

public class Jx1 extends Ifabs{
    @Override
    public void f() {
        System.out.println("这是具体类");
    }

    @Override
    public Jx1 func() {
        return new Jx1();
    }
}
