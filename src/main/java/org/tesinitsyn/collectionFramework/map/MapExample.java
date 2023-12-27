package org.tesinitsyn.collectionFramework.map;

import java.util.*;

public class MapExample {

    static void hashMap() {

        //init
        Map<Integer, String> map = new HashMap<>();

        //insert
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //search
        System.out.println(map.get(1));

        //delete
        map.remove(1);

        //search
        System.out.println(map.containsKey(1));

        //iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    static void treeMap() {

        //init
        Map<Integer, String> map = new TreeMap<>();

        //insert
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");


        //search
        System.out.println(map.get(1));

        //delete
        map.remove(1);

        //search
        System.out.println(map.containsKey(1));

        //iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    static void linkedHashMap() {

        //init
        Map<Integer, String> map = new LinkedHashMap<>();

        //insert
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //update
        //no such option

        //delete
        map.remove(1);

        //search
        System.out.println(map.get(1));

        //iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static void hashTable() {

        //init
        Map<Integer, String> map = new Hashtable<>();

        //insert
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //update
        //no such option

        //delete
        map.remove(1);

        //search
        System.out.println(map.get(1));

        //iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        hashMap();
        treeMap();
        linkedHashMap();
        hashTable();
    }
}

