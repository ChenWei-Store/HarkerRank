package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;

/**
 * Created by chenw on 2017/7/9.
 */
public class DeleteDuplicateValue {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(3);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(5);
        linkedList.insertLast(5);
        linkedList.printf();
        System.out.println("---------------------");
        linkedList.removeRepeatData();
        linkedList.printf();

    }
}
