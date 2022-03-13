package com.blz.linkedlist;

public class Operations {

    public LinkedList addElementInStart() {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

        return linkedList;
    }
    public void addElementInEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.display();

    }
    public static void insertInMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(70);
        System.out.println("Before");
        linkedList.display();
        linkedList.insertInMiddle(30);
        System.out.println("After");
        linkedList.display();

    }

    public void deleteNodeFromStart() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.pop();
        linkedList.display();
    }

    public void deleteNodeFromEnd() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.poplast();
        linkedList.display();
    }

    public void searchNode() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.search(30);
    }

    public void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node first = linkedList.append(56);
        Node second = linkedList.append(30);
        Node third = linkedList.append(70);
        Node newNode = new Node(40);
        System.out.println("Before");
        linkedList.display();
        System.out.println();
        linkedList.insertInBetween(second, newNode);
        System.out.println("After");
        linkedList.display();
    }
}