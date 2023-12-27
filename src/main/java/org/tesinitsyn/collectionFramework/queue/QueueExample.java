package org.tesinitsyn.collectionFramework.queue;

import java.util.*;

public class QueueExample {

    static void priorityQueue() {
        System.out.println("PriorityQueue example start\n");
        //init
        Queue<Integer> queue = new PriorityQueue<>(List.of(1, 2, 3, 4));

        //insert
        queue.offer(10000);
        queue.offer(6);

        //update
        //no such option

        //delete
        queue.poll();
        queue.remove(10000);

        //search
        System.out.println(queue.contains(3));

        //get
        System.out.println(queue.peek() + "\n");

        //iterate
        for (Integer i : queue) {
            System.out.println(i);
        }
        System.out.println("PriorityQueue example ends\n");

    }

    static void arrayDeque() {
        //init
        Deque<Integer> deque = new ArrayDeque<>(List.of(1, 2, 3, 4));

        //insert
        deque.add(10000);
        deque.addFirst(6);
        deque.addLast(5);

        //update
        //no such option

        //delete
        deque.remove();
        deque.removeFirst();
        deque.removeLast();

        //search
        System.out.println(deque.contains(3) + "\n");

        //get
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast() + "\n");

        //iterate
        for (Integer i : deque) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //priorityQueue();
        //arrayDeque();
    }
}
