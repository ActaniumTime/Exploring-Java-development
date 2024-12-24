package com.classes;

public class Task implements Runnable {
    private final int taskID;

    public Task(int taskID){
        this.taskID = taskID;
    }

    @Override
    public void run(){
        try {
            System.out.println("Task " + taskID + " is starting.");
            Thread.sleep(500);  // Симуляція виконання завдання (затримка на 500 мс)
            System.out.println("Task " + taskID + " has finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Обробка переривання
            System.out.println("Task " + taskID + " was interrupted.");
        }
    }
}
