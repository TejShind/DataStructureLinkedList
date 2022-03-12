package com.blz.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

//Compute to Add data from Start.
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
//Printing Purpose.
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
//Adding data from end.
        public Node append(int data) {
            Node newNode = new Node(data);
            if (head != null && tail != null) {
                tail.next = newNode;
            } else {
                this.head = newNode;
            }
            this.tail = newNode;
            return newNode;
        }
// Add data in between two Nodes.
    public void insertInMiddle(int data) {
        Node newNode = new Node(data);
        int length = size();
        int mid = length % 2 == 0 ? length / 2 : (length + 1) / 2;//by usingTrinity operator
        Node prevNode = head;
        Node nextNode = head;
        for (int i = 0; i < mid; i++) {
            prevNode = nextNode;  // 56
            nextNode = nextNode.next;  //70
        }
        prevNode.next = newNode;   // 56 -> 30
        newNode.next = nextNode;  // 30 - > 70
    }
    // Count length of Linked list.
    public int size() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

}