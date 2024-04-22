package org.okten.javacore;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {

    // O(n) O(1) O(n logn) O(n^2)



    public static void main(String[] args) {
        List<String> strings = List.of("s1", "s2", "s3");

        for (String string : strings) {
            System.out.println(string);
        }

        CustomIterable customIterable = new CustomIterable();

        for (String string : customIterable) {
            System.out.println(string);
        }

        List<String> listWithDuplicatedElements = new LinkedList<>();
        listWithDuplicatedElements.add("s1");
        listWithDuplicatedElements.add("s2");
        listWithDuplicatedElements.add("s2");
        listWithDuplicatedElements.add(null);
        listWithDuplicatedElements.add(null);

        System.out.println("List: " + listWithDuplicatedElements);

        // LIFO - last in first out - Stack
        // FIFO - first in first out - Queue

        // FIFO
        Queue<String> queue = new LinkedList<>();
        // LIFO + FIFO
        Deque<String> doubleQueue = new LinkedList<>();

        Set<String> stringSet = new HashSet<>();
        stringSet.add("s1");
        stringSet.add("s2");
        stringSet.add("s3");
        stringSet.add("s3");
        System.out.println("Set: " + stringSet);
    }

    // O(1)
    private static void nonComplexMethod(String text) {
        System.out.println(text);
    }
}
