package com.blz.linkedlist;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Linked list Program");
        System.out.println("Display the Simple Linked List");
        //Initialisation of linked list
        Node first = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);
        first.next = second;//pointer
        second.next = third;
        Node head = first;
        Node temp = head;
        // printing purpose.

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;//    temp=56 / temp.next=address of next Key i.e.30
        }
    }
}
