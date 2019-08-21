/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author MAMUN
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        //Offers facility of QUEUE but does not mainatain FIFO manner
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(3);
        pq.add(6);
        pq.add(7);
        
        pq.offer(55);
        
        System.out.println("head by element method " + pq.element());
        System.out.println("head by peek method " + pq.peek());
        System.out.println("remove() " + pq.remove());
        System.out.println("poll() " + pq.poll());
        
        Iterator itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
    }
}
