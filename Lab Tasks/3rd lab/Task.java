import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Task {
    private static Queue<Integer> queue = new LinkedList<>();
    private static Random random = new Random();
    public static void main(String[] args) {
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue: " + queue);
        int element=removeRandom();
        if(element!=0){
            System.out.println("Removed random element: " + element);
        }
        System.out.println("Queue after removing a random element: " + queue);
    }
    public static int removeRandom() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty, cannot remove a random element.");
            return 0;
        }
        int index = random.nextInt(queue.size());
        int element = 0;
        int i = 0;
        for (Integer item : queue) {
            if (i == index) {
                element = item;
                break;
            }
            i++;
        }
        queue.remove(element);
        return element;
    }
}
