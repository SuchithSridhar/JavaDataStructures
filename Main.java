import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        String string;
        Scanner input = new Scanner(System.in);

        string = ("\n\n --- Main Program - Implement DataStructures ---");
        System.out.println(string);
        string = ("\n-- MENU --\n" + "0. Exit\n" + "1. Array Stacks\n" + "2. Array Queue\n" + "3. Node Stacks\n"
                + "4. Node Queue\n");

        while (true) {
            System.out.println(string);
            System.out.print("\nEnter your Choice:");
            choice = Integer.valueOf(input.nextLine());
            System.out.println();

            switch (choice) {
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                case 1:
                    arrayStackDemo();
                    break;
                case 2:
                    arrayQueueDemo();
                    break;
                case 3:
                    nodeStackDemo();
                    break;
                case 4:
                    nodeQueueDemo();
                    break;

                default:
                    break;
            }
        }

    }

    protected static void arrayStackDemo() {
        System.out.println("- Reverse a list using stacks");

        Integer[] array = { 1, 15, 48, 26, 45, 75 };
        ArrayStack stack = new ArrayStack(array.length);

        System.out.println(Arrays.toString(array) + " - Original Array");

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (Integer) stack.pop();
        }
        System.out.println(Arrays.toString(array) + " - Revesed Array");
        System.out.println("--- Demo Completed ---");

    }

    protected static void arrayQueueDemo() {
        System.out.println("- Inserting and deleteing into queue");

        Integer[] array = { 1, 15, 48, 26, 45, 75 };
        ArrayQueue queue = new ArrayQueue(array.length);
        Integer element;

        System.out.println(Arrays.toString(array) + "- Inserting elements in this order");
        for (Integer ele : array) {
            queue.enqueue(ele);
            System.out.println("Inserted element: " + ele);
        }

        System.out.println("--- Completed Inserting elements, begin to remove ---");
        while (queue.size() != 0) {
            element = (Integer) queue.dequeue();
            System.out.println("Removed element: " + element);
        }
        System.out.println("--- Demo Completed ---");

    }

    protected static void nodeStackDemo() {
        System.out.println("- Reverse a list using stacks");

        Integer[] array = { 1, 15, 48, 26, 45, 75 };
        NodeStack stack = new NodeStack();

        System.out.println(Arrays.toString(array) + " - Original Array");

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (Integer) stack.pop();
        }
        System.out.println(Arrays.toString(array) + " - Revesed Array");
        System.out.println("--- Demo Completed ---");

    }

    protected static void nodeQueueDemo() {
        System.out.println("- Inserting and deleteing into queue");

        Integer[] array = { 1, 15, 48, 26, 45, 75 };
        NodeQueue queue = new NodeQueue();
        Integer element;

        System.out.println(Arrays.toString(array) + "- Inserting elements in this order");
        for (Integer ele : array) {
            queue.enqueue(ele);
            System.out.println("Inserted element: " + ele);
        }

        System.out.println("--- Completed Inserting elements, begin to remove ---");
        while (queue.size() != 0) {
            element = (Integer) queue.dequeue();
            System.out.println("Removed element: " + element);
        }
        System.out.println("--- Demo Completed ---");
    }
}