package org.tesinitsyn.collectionFramework.list;

import java.util.*;

public class ListExample {

    static void arrayList() {

        System.out.println("List example start\n");
        //init
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        //insert
        list.add(789);

        //update
        list.set(0, 123);

        //delete
        list.remove(1);
        list.remove(Integer.valueOf(3));

        //search
        System.out.println(list.get(0));

        //iterate
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("\nList example end\n");
    }

    static void linkedList() {
        System.out.println("LinkedList example start\n");

        //init
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4));

        //insert
        list.push(789);

        //update
        list.set(0, 123);

        //delete
        list.remove(1);

        //search
        System.out.println(list.get(0));

        //iterate
        for (Integer i : list) {
            System.out.println(i);
        }

        //linkedList specific methods
        list.removeFirst();
        list.removeLast();
        list.addFirst(1);
        list.addLast(100000);
        //and more because it's implements queue

        System.out.println("\nLinkedList example end\n");

    }

    static void vector() {
        System.out.println("Vector example start\n");

        //init
        List<Integer> list = new Vector<>(List.of(1, 2, 3, 4));

        //insert
        list.add(789);

        //update
        list.set(0, 123);

        //delete
        list.remove(1);
        list.remove(Integer.valueOf(3));

        //search
        System.out.println(list.get(0));

        //iterate
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("\nVector example end\n");
    }

    static void stack() {
        System.out.println("Stack example start\n");

        //init
        Stack<Integer> stack = new Stack<>();

        //insert
        stack.push(1);
        stack.push(2);
        stack.push(50);
        stack.push(10000);
        stack.push(4);

        for (Integer i : stack) {
            System.out.println(i);
        }
        System.out.println();
        //delete
        stack.pop();
        stack.remove(1);

        //update
        stack.set(0, 100);

        //search
        System.out.println(stack.search(50) + "\n");

        //iterate
        for (Integer i : stack) {
            System.out.println(i);
        }

        System.out.println("\nStack example end\n");
    }

    public static void main(String[] args) {
        //arrayList();
        //linkedList();
        //vector();
        //stack();
    }
}
