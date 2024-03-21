package com.kanak.behaviouralPatterns.observerPattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

    public class EventSource extends Observable implements Runnable {
        @Override
        public void run() {
            try {
                final InputStreamReader isr = new InputStreamReader(System.in);
                final BufferedReader br = new BufferedReader(isr);
                while (true) {
                    System.out.println("Enter msg : ");
                    String response = br.readLine();
                    setChanged();
                    notifyObservers(response);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

