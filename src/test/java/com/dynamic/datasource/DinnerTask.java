package com.dynamic.datasource;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/19
 **/
public class DinnerTask implements Runnable{
    private String name;
    private ConcurrentLinkedQueue concurrentLinkedQueue;
    private CountDownLatch countDownLatch;

    public DinnerTask(String name, ConcurrentLinkedQueue concurrentLinkedQueue, CountDownLatch countDownLatch) {
        this.name = name;
        this.concurrentLinkedQueue = concurrentLinkedQueue;
        this.countDownLatch = countDownLatch;
    }
    //具体的吃饭逻辑
    @Override
    public void run() {
        while (!concurrentLinkedQueue.isEmpty()){
            System.out.println(concurrentLinkedQueue.poll()+"正在"+name+"用餐");
        }
        countDownLatch.countDown();
    }
}
