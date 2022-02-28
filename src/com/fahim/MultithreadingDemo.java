package com.fahim;

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // t1 finishes before t2
        producer.join();
        consumer.join();
    }
}
