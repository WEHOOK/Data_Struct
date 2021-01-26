package com.smith.Linked;

public class LinkedMain {

    public static void main(String[] args) {
	// write your code here

        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }

        System.out.println(linkedList.toString());


        linkedList.addLast(5);
        System.out.println(linkedList.toString());

        linkedList.add(20,2);
        System.out.println(linkedList.toString());


    }
}
