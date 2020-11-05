package pl.javastart.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    private static Scanner input = new Scanner(System.in);

    public static void addTask(Queue<Task> queue) {

        System.out.println("Input name of the task:");
        String name = input.next();
        System.out.println("Input description of the task:");
        String description = input.next();
        System.out.println("Input priority of the task:");
        String priorityStr = input.next();
        Priority priority = Priority.valueOf(priorityStr);

        Task task = new Task(name, description, priority);
        queue.offer(task);
    }

    public static void printTasks(Queue<Task> queue) {
        for (Task task : queue) {
            System.out.println(task);
        }
    }
}
