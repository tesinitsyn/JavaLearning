package org.tesinitsyn.collectionFramework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    static void hashSet() {
        //init
        Set<Integer> set = new HashSet<>(Set.of(1,2,3,4));

        //insert
        set.add(5);

        //update
        //no such option

        //delete
        set.remove(3);

        //search
        System.out.println(set.contains(3));

        //iterate
        for (Integer i : set) {
            System.out.println(i);
        }

    }

    static void linkedHashSet() {

        //init
        Set<Integer> set = new LinkedHashSet<>(Set.of(1,2,3,4));

        //insert
        set.add(5);

        //update
        //no such option

        //delete
        set.remove(3);

        //search
        System.out.println(set.contains(3));
        System.out.println();

        //iterate
        for (Integer i : set) {
            System.out.println(i);
        }

    }

    static void treeSet() {

        //init
        Set<Integer> set = new TreeSet<>(Set.of(1,2,3,4));

        //insert
        set.add(5);

        //update
        //no such option

        //delete
        set.remove(3);

        //search
        System.out.println(set.contains(3));

        //iterate
        for (Integer i : set) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {

//        hashSet();
//        linkedHashSet();
//        treeSet();
    }
}
