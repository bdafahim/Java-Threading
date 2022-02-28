package com.sheba.fahim;

public class MultithreadingDemo {
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
        {
            Thread thread = new Thread(new Multithread());
            thread.start();
        }
    }
}
