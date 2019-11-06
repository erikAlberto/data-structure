package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(10);
        //System.out.println(list.element());
        //list.iterator().next();
        LinkedListUtils.insertSorted(list,4);
    }
}
