package com.dynamic.datasource;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/19
 **/
public class TestCurrentLinkedQueue {

    @Test
    public void test1() throws Exception{
         //吃饭的人数
         Integer peopelNumber=10000;
         //桌子的人数
         Integer tableNumber=10;

         //线程控制类
        CountDownLatch count = new CountDownLatch(tableNumber);//计数器

        ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();

        //把人放进安全队列中，线程去叫
        for (int i = 0; i < peopelNumber; i++) {
            queue.offer("顾客"+i+"先生");
        }
        ExecutorService executorService = Executors.newFixedThreadPool(tableNumber);
        System.out.println("============开饭了===============");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < tableNumber; i++) {
            executorService.submit(new DinnerTask(i+"号桌",queue,count));
        }
        count.await();
        long endTime = System.currentTimeMillis();
        System.out.println("=========所有人都吃完了=======");
        System.out.println("=========共耗时"+(endTime - startTime)+"==========");
    }

    @Test
    public void test2(){
        List<String> strings = Arrays.asList("A", "C");
        System.out.println(strings.contains("A"));
    }
}
