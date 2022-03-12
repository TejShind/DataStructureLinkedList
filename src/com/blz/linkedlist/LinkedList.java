package com.blz.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

//Compute to Add data
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;//70... 30(head)..56(head)
            this.head = newNode;
            newNode.next = temp;
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
    }
}