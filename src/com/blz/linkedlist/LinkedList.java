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
        int mid = length % 2 == 0 ? length / 2 : (length + 1) / 2;//by using Turnery operator
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

    //Delete data from start.
    public Node pop() {
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }

    //Delete data from End.
    public void poplast() {
        Node tempNode = head;
        while (!tempNode.next.equals(this.tail)) {
            tempNode = tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next = null;
    }

    //Searches the specified node with value.
    public void search(int value) {
        Node tempNode = head;
        int count = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                count++;
                tempNode = tempNode.next;
            }
        }
        if (flag) {
            System.out.println("Element is present at " + count + " position");
        } else {
            System.out.println("Element is not present in linked list");
        }
    }
//Inserting node after given node.

    public void insertInBetween(Node node, Node newNode) {
        Node temp = node.next;
        node.next = newNode;
        newNode.next = temp;
    }
    //Deleting a given node from the list

    public void DeletingGivenNode(int deletingNode) {
        if (head == null) {
            System.out.println("Empty linked list");
        } else {
            Node temp = head;
            Node prev = head;
            while (temp != null) {
                if (temp.data == deletingNode) {
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
    }
}