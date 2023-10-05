/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationhardcodelinkedlists;

import java.util.Arrays;


/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      LinkedList list = new LinkedList();
         //java.util.LinkedList list = new java.util.LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
        System.out.println(list.indexOf(50));
        System.out.println(list.contains(20));
        
        

    }
    
}
