package com.blz.linkedlist;

public class Operations {

    public void addElementInStart() {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

    }
    public void addElementInEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.display();

    }
}