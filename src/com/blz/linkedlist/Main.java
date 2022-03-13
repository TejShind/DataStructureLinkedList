package com.blz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations operations = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Data structure program using Linked List");
        System.out.println(" Enter 1 to Add data from start ");
        System.out.println(" Enter 2 to Add data from last ");
        System.out.println(" Enter 3 to Add data in between two nodes ");
        System.out.println(" Enter 4 to Delete data from start ");
        System.out.println(" Enter 5 to Delete data from end ");
        System.out.println(" Enter 6 to Search Linked list to find specific node");


        switch (sc.nextInt()) {

            case 1:
                operations.addElementInStart();
                break;
            case 2:
                operations.addElementInEnd();
                break;
            case 3:
                Operations.insertInMiddle();
                break;
            case 4:
                operations.deleteNodeFromStart();
                break;
            case 5:
                operations.deleteNodeFromEnd();
                break;
            case 6:
                operations.searchNode();
                break;
            default:

        }
        }
    }
