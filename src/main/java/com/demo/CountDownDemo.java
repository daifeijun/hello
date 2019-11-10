package com.demo;

import java.util.concurrent.CountDownLatch;

public class CountDownDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"ZOUREN");
                countDownLatch.countDown();

            },String.valueOf(i)).start();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("班长关门");

    }


}
