package com.blz.linkedlist;

public class Node {
    //Instance variable
    public int data;
    public Node next;
    //Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

