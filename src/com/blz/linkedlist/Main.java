package com.blz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations operations = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To the Data structure program using Linked List");

        System.out.println(" Enter 1 for displaying Linked list data from start ");

        switch (sc.nextInt()) {

            case 1:
                operations.addElementInStart();
                break;

            }
        }
    }
