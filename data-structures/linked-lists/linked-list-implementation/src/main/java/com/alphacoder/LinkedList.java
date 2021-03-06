package com.alphacoder;

public class LinkedList {
    private Node head;

    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public void print(){
        Node temp= head;

        System.out.print("[ ");
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.print("]");
        System.out.println();
    }
    /*
    Time complexity: O(1)
    Space complexity: O(1)
     */
    public void push(int data){
        Node node= new Node(data);
        node.next= head;
        head= node;
    }

    public void append(int data){
        Node node= new Node(data);
        Node temp= head;
        Node previous= null;
        while(temp!= null){
            previous= temp;
            temp= temp.next;
        }

        previous.next= node;
    }

    public void insertAfter(int data, Node previousNode){
        Node node= new Node(data);
        node.next= previousNode.next;
        previousNode.next= node;
    }

    public Node findNode(int data){
        Node node= null;
        Node temp= head;
        while(temp!= null){
            if(temp.data== data){
                node= temp;
                break;
            }else{
                temp= temp.next;
            }
        }
        return node;
    }

    public void delete(int data){
        Node temp= head;
        Node previous= null;

        if(temp.data== data && temp!= null){
            head= temp.next;
            return;
        }

        while(temp!= null && temp.data!= data){
            previous= temp;
            temp= temp.next;
        }

        if(temp== null){
            return;
        }

        previous.next= temp.next;
    }

    /*
     Time Complexity: O(n)
     Space Complexity: O(1)
     */
    public void reverse(){
        Node previous= null;
        Node current= head;
        Node next= current.next;

        while(current!= null){
            current.next= previous;
            previous= current;
            current= next;
            if(current!= null) {
                next = current.next;
            }
        }

        head= previous;
    }

    public void reverseRecursively(){
        head= reverseRecursively(head);
    }

    private Node reverseRecursively(Node head){
        if(head== null || head.next== null){
            return head;
        }


        Node node= reverseRecursively(head.next);
        head.next.next= head;
        head.next= null;

        return node;
    }

    public void printReverse(){
        System.out.println("Reverse Print.");
        printReverse(head);
    }
    private void printReverse(Node head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.println(head.data);
    }
}
