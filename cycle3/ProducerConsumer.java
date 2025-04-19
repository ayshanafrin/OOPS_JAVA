class DataBuffer {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer waiting...");
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify();
    }

    synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer waiting...");
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
        return data;
    }
}

class Producer extends Thread {
    DataBuffer buffer;

    Producer(DataBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Producer sleep error");
            }
        }
    }
}

class Consumer extends Thread {
    DataBuffer buffer;

    Consumer(DataBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Consumer sleep error");
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBuffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
 
