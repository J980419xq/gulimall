package com.example.gulimall.product;

public class Private {
    private Private() {}

    private static volatile Private singleton;
    public static Private getInstance() {
        if (singleton == null) {
            synchronized (Private.class) {
                if (singleton == null) {
                    singleton = new Private();
                }
            }
        }
        return singleton;
    }
}
