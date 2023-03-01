package com.java2novice.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Day4_LinkedList {
    public static void main(String a[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println(list);

        //1.Append the specified element to the end of a linked list.
        System.out.println("Adding element at last position...");
        list.addLast("Five");
        System.out.println(list);

        //2.Iterate through all elements in a linked list.
        Iterator i = list.iterator();
        System.out.println("The LinkedList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //3.Iterate through all elements in a linked list starting at the specified position.
        for (int i = 2; i < list.size(); i++) {
            System.out.println(list.get(i));
    }
}