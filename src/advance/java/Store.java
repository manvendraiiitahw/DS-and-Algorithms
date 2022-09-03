/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author betha
 */
public class Store {
    
    public static void main(String[] args) {                
        
        Queue<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

    }
    
    static void serveCustomer(Queue<Customer> queue) {
        
        Customer c = queue.poll();
        assert c != null;
        c.serve();
        
    }
    
}
