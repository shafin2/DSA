import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyQueue<T> {

    private Queue<T> queue = new LinkedList<>();
    private Random random = new Random();

    public T removeRandom() {
        if (queue.isEmpty()) {
            return null;
        }
        int index = random.nextInt(queue.size());
        T element = null;
        // Iterate over the queue until we reach the random index
        for (T item : queue) {
            if (index == 0) {
                element = item;
                break;
            }
            index--;
        }

        // Remove the element from the queue and return it
        queue.remove(element);
        return element;
    }
    // Enqueue - add element to the back of the queue
    public void enqueue(T element) {
        queue.add(element);
    }

    // Dequeue - remove and return element from the front of the queue
    public T dequeue() {
        return queue.poll();
    }

    // Peek - return element at the front of the queue without removing it
    public T peek() {
        return queue.peek();
    }

    // Size - return number of elements currently in the queue
    public int size() {
        return queue.size();
    }

    // isEmpty - return true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Clear - remove all elements from the queue
    public void clear() {
        queue.clear();
    }

    // Contains - check if a particular element is present in the queue
    public boolean contains(T element) {
        return queue.contains(element);
    }
}
