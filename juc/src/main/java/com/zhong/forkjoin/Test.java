package com.zhong.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        test1(); //7688
        test2(); //8186
        test3(); //139
    }

    /*
        操作比较大的数的时候，注意溢出问题
        JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
    */

    //普通人, 用this。来调
    public static void test1(){
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (Long i = 1L; i <= 10_0000_0000 ; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum= "+ sum +" 时间：" + (end-start));
    }

    //会用ForkJoin的
    public static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L,10_0000_0000L);
        ForkJoinTask<Long> submit = forkJoinPool.submit(task);//提交任务
        Long sum = submit.get();
        long end = System.currentTimeMillis();
        System.out.println("sum= "+ sum +" 时间：" + (end-start));
    }

    //Stream 并行流
    public static void test3(){
        long start = System.currentTimeMillis();
        //Stream 并行流
        long sum = LongStream.rangeClosed(0L,10_0000_0000L).parallel().reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum= "+ sum +" 时间：" + (end-start));
    }



}
