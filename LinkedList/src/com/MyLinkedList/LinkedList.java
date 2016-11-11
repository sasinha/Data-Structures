package com.MyLinkedList;


public class LinkedList {

    // Initialize head and tail
    private Node head = null;
    private Node tail = null;
    private Node temp = null;

    //Counter to quickly get size without iteration
    private int counter = 0;
    private int size() {
        return counter;
    }


    // Constructor
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

        //Increment counter with new node added in
        counter++;

        }

    public int get(int index) {
        assert (index >= 0 && index < size());

        //Temp used to check nodes
        temp = head;
        for(int i = 0; i < index; i++) {

            //iterate through list
            temp = temp.next;
        }

        // Return correct indexed element
        return temp.element;
    }

    }


