package com.app;
import com.classes.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args )
//            throws InterruptedException (for task 2)
    {

        //task1

//        MyThread thread1 = new MyThread("Thread 1");
//        MyThread thread2 = new MyThread("Thread 2");
//        MyThread thread3 = new MyThread("Thread 3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        try{
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        }
//        catch (InterruptedException e) {
//            System.out.println("Main thread has been interrupted");
//        }
//
//        System.out.println("All thread has been finished");

        //task 2
//        Counter counter = new Counter();
//
//        MyThread thread1 = new MyThread(counter);
//        MyThread thread2 = new MyThread(counter);
//        MyThread thread3 = new MyThread(counter);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
//
//        System.out.println("Final value of count (with sync) is : " + counter.count);

        //task 3

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        for (int i = 1; i <= 10; i++){
//            Task task = new Task(i);
//            executorService.submit(task);
//        }
//
//        executorService.shutdown();
//
//        try{
//            if(!executorService.awaitTermination(1, TimeUnit.MINUTES)){
//                executorService.shutdownNow();
//                System.out.println("Executor service did not terminate in the specified time.");
//            }
//            else {
//                System.out.println("All tasks completed successfully.");
//            }
//        }
//        catch (InterruptedException e){
//            executorService.shutdownNow();
//            Thread.currentThread().interrupt();
//        }
    }
}