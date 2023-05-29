/*
 * File: Main.java
 * Version: 1.0.0
 * Date: 05/28/2023
 * Author: Jensy Fernandez
 * Class: CEN-4025C
 * Professor: Mary Walauskis Valencia College
 * Description: Write a Java application that does the following. The Main method should:
 * Call a new method which adds 2,000,000 random integers into an ArrayList, then deletes each one from the ArrayList
 * Call a new method which adds 2,000,000 random integers into a LinkedList, then deletes each one from the LinkedList
 * Call a new method which adds 2,000,000 random integers into a Hashtable, then deletes each one from the Hashtable
 */
package cen.module4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * This class demonstrates adding and deleting random integers from JProfiler, ArrayList, LinkedList, and Hashtable.
 */
public class Main {
    /**
     * The main method that executes the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
    	startJProfiler();
    	addAndDeleteFromArrayList();
        addAndDeleteFromLinkedList();
        addAndDeleteFromHashtable();
    }
    
    /**
     * Starts JProfiler by attaching the JProfiler agent to the Java application.
     */
    public static void startJProfiler() {
        // Specify the JProfiler agent path on my computer
        String agentPath = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\JProfiler 13";
        
        // Specify the JProfiler port this is the most common as per net
        int port = 8849;
        
        // Start JProfiler
        System.setProperty("java.library.path", agentPath);
        System.setProperty("agentPath", agentPath);
        System.setProperty("jdk.attach.allowAttachSelf", "true");
        System.setProperty("JProfiler.sessionId", "your_session_id");
        System.setProperty("JProfiler.home", agentPath);
        System.setProperty("JProfiler.agentPort", Integer.toString(port));
    }
    
    /**
     * Adds 2,000,000 random integers to an ArrayList and then deletes each one from it.
     */
    public static void addAndDeleteFromArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        
        System.out.println("Please stand by, Adding random integers to ArrayList...");
        long startTime = System.currentTimeMillis();
        
        // Adding 2,000,000 random integers into the ArrayList
        for (int i = 0; i < 2000000; i++) {
            int randomNumber = random.nextInt();
            arrayList.add(randomNumber);
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Random integers added to ArrayList complete. Time taken: " + (endTime - startTime) + " ms");
        
        System.out.println("\nDeleting random integers from ArrayList...");
        startTime = System.currentTimeMillis();
        
        // Deleting each integer from the ArrayList using an iterator
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Random integers deleted from ArrayList. Time taken: " + (endTime - startTime) + " ms");
    }
    
    /**
     * Adds 2,000,000 random integers to a LinkedList and then deletes each one from it.
     */
    public static void addAndDeleteFromLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        
        System.out.println("\nPlease stand by, Adding random integers to LinkedList...");
        long startTime = System.currentTimeMillis();
        
        // Adding 2,000,000 random integers into the LinkedList
        for (int i = 0; i < 2000000; i++) {
            int randomNumber = random.nextInt();
            linkedList.add(randomNumber);
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Random integers added to LinkedList complete. Time taken: " + (endTime - startTime) + " ms");
        
        System.out.println("\nDeleting random integers from LinkedList...");
        startTime = System.currentTimeMillis();
        
        // Deleting each integer from the LinkedList using an iterator
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Random integers deleted from LinkedList. Time taken: " + (endTime - startTime) + " ms");
    }
    
    /**
     * Adds 2,000,000 random integers to a Hashtable and then deletes each one from it.
     */
    public static void addAndDeleteFromHashtable() {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        Random random = new Random();
        
        System.out.println("\nPlease stand by, Adding random integers to Hashtable...");
        long startTime = System.currentTimeMillis();
        
        // Adding 2,000,000 random integers into the Hashtable
        for (int i = 0; i < 2000000; i++) {
            int randomNumber = random.nextInt();
            hashtable.put(randomNumber, randomNumber);
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Random integers added to Hashtable complete. Time taken: " + (endTime - startTime) + " ms");
        
        System.out.println("\nDeleting random integers from Hashtable...");
        startTime = System.currentTimeMillis();
        
        // Deleting each integer from the Hashtable using an iterator
        Iterator<Integer> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Random integers deleted from Hashtable. Time taken: " + (endTime - startTime) + " ms");
    }
}
