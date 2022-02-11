package com.SriVamsi;
public class insertinlinkedlist {
    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void addnode(int data){
        Node newnode = new Node(data);
        if(head==null){
            head= newnode;
        }
        else{
            tail.next=newnode;
        }
        tail=newnode;
    }
    public void reverse(Node current){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(current.next==null){
                System.out.print(current.data+" ");
                return;
            }
            reverse(current.next);
            System.out.print(current.data+" ");
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        insertinlinkedlist ncx = new insertinlinkedlist();
        ncx.addnode(23);
        ncx.addnode(34);
        ncx.addnode(45);
        ncx.display();
        //hello vamsi
        System.out.println("reverse");
        ncx.reverse(ncx.head);
    }

}