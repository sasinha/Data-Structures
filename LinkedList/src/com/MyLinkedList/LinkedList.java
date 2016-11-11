package com.MyLinkedList;


public class LinkedList {

    // Initialize head and tail
    private Node head = null;
    private Node tail = null;

    // Empty constructor
    public LinkedList() {
    }

    public void add(int inElem) {
        if (head == null) {

            // Create tail and head of linked list
            head = tail = new Node();

            //head is the added element
            head.element = inElem;

            //circle back
            head.next = tail;
            tail = head;

        }
        else {
            // Set new node to end
            tail.next = new Node();
            // Set tail to new object
            tail = tail.next;
            // Set added element to tail element
            tail.element = inElem;
        }

        }

    }


