import java.util.concurrent.Semaphore;
import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;
    private Semaphore empty;
    private Semaphore full;
    private Semaphore mutex = new Semaphore(1);

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.empty = new Semaphore(capacity); // Initially, all slots are empty
        this.full = new Semaphore(0);         // Initially, no slots are full
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire(); // Wait for an empty slot
        mutex.acquire(); // Enter critical section

        // Add item to the buffer
        queue.add(item);
        System.out.println("Produced: " + item);

        mutex.release(); // Exit critical section
        full.release();  // Signal that a new item is available
    }

    public int consume() throws InterruptedException {
        full.acquire(); // Wait for a full slot
        mutex.acquire(); // Enter critical section

        // Remove item from the buffer
        int item = queue.poll();
        System.out.println("Consumed: " + item);

        mutex.release(); // Exit critical section
        empty.release(); // Signal that an empty slot is available

        return item;
    }
}
class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Create a buffer with a capacity of 5

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}