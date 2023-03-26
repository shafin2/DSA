import java.util.Queue;

public class Main{
    static Queue<Integer> que;
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        // Enqueue some elements
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");

        // Print the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Peek at the front element of the queue
        System.out.println("Front element of the queue: " + queue.peek());

        // Dequeue some elements and print them
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Check if the queue contains an element
        System.out.println("Does the queue contain \"Charlie\"? " + queue.contains("Charlie"));

        // Clear the queue and print the size
        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
    }
}