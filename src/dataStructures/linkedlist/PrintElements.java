package dataStructures.linkedlist;

import dataStructures.linkedlist.utils.LinkedList;

/**
 * Created by chenw on 2017/6/24.
 */
public class PrintElements {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(5);
        linkedList.printf();
    }


}
