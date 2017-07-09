package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;

/**
 * Created by chenw on 2017/6/24.
 */
public class InsertHead {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(0);
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.printf();
    }
}
