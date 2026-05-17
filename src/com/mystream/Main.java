/**
 *  Java program to create a Stream with 5 random double elements.
 */

package com.mystream;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a stream with doubles.
        Random random = new Random();
        DoubleStream myStream = random.doubles().limit(5);

        // Printing myStream to console.
        myStream.forEach(System.out::println);

    }
}