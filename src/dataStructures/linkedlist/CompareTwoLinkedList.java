package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;


/**
 * Created by chenw on 2017/7/9.
 */
public class CompareTwoLinkedList {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList(0);
        linkedList.insertFirst(2);
        linkedList.insertNodeByPosi(10,1);
        linkedList.insertLast(5);
        linkedList.insertLast(8);
        linkedList.printf();
        System.out.println("------------------------------");
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insertLast(2);
        linkedList1.insertLast(10);
        linkedList1.insertLast(0);
        linkedList1.insertLast(5);
        linkedList1.insertLast(0);
        linkedList1.printf();
        boolean isEquals = linkedList.equals(linkedList1);
        System.out.println("isEquals: " + isEquals);
    }
}
