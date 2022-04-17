package com.example.project1_comp242;

public class DoubleEndedList<T extends Comparable<T>> extends LinkedList<T> {

    private Node<T> tail;

    public Node<T> getTail() {
        return tail;
    }

    public void addAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);
        if(super.getHead() == null) {
            super.setHead(newNode);
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void addAtStart(T data) {
        Node<T> newNode = new Node<T>(data);
        if (super.getHead() == null) {
            super.setHead(newNode);
            tail = newNode;
        }
        else{
            newNode.setNext(super.getHead());
            super.setHead(newNode);
        }
    }





}
