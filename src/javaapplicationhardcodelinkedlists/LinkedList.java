/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationhardcodelinkedlists;

import static java.nio.file.Files.size;
import java.util.NoSuchElementException;

/**
 *
 * @author oz
 */
public class LinkedList {

    private int size;
    
    private class Node {
    private int value; // index[i]
    private Node next; //  address which make hooks up next address .
    
    // Constructor
    public Node(int value){
        this.value=value;
    }
    
}
    private Node first; //head
    private Node last; //tail
    
    // We dont need a setter becauase of below code .
    public void addLast(int item){
        var node = new Node(item);
        if(first==null)
            first=last=node;
        else{
            last.next=node;
            last=node;
        }
        
    }
    
    public void addFirst(int item){
        var node = new Node(item);
        if(first==null)
            first=last=node;
        else{
            first.next=node;
            first=node;
        }
        
    }
    
    // make function if the empty
    
    private  boolean isEmpty(){
        return first==null;  
    }
    
    public int indexOf(int item){
        int index=0;
        var current=first;
        while(current!=null){
            if(current.value==item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    
    public boolean contains(int item){
        int indexOf;
        return indexOf(item) !=-1;
    }
    
    
    
    
     public void removeFirst() {
    if (isEmpty())
      throw new NoSuchElementException();

    if (first == last)
      first = last = null;
    else {
      var second = first.next;
      first.next = null;
      first = second;
    }

    size--;
  }
     public void removeLast() {
         var second = first.next;
         first.next=null;
         first=second;
       
  }
}
