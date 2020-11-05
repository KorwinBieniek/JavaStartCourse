package pl.javastart.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskApp {
    private static Scanner input = new Scanner(System.in);
    private static Queue<Task> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        queue.offer(new Task("Gotowanie", "Gotowanko", Priority.MODERATE));
        queue.offer(new Task("Sprzatanie", "Sprzatanko", Priority.LOW));
        queue.offer(new Task("Odkurzanie", "Odkurzanko", Priority.LOW));
        queue.offer(new Task("Mycie", "Myjonko", Priority.HIGH));


        int choice;

        do {
            choice = input.nextInt();

            switch (choice) {
                case 1 -> TaskManager.addTask(queue);

                case 2 -> TaskManager.printTasks(queue);

                case 3 -> {
                    if(queue.isEmpty()) {
                        System.out.println("No tasks to do");
                    }else {
                        queue.poll();
                        System.out.println("Next task to do is: " + queue.peek());
                    }

                }

                case 0 -> System.out.println("Goodbye!");
            }


        } while (choice != 0);
    }
}
