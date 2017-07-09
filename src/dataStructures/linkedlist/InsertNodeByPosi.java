package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;

/**
 * Created by chenw on 2017/6/24.
 */
public class InsertNodeByPosi {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertLast(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);
        //4,2,1,3,5
        linkedList.insertNodeByPosi(10, 0);
        linkedList.insertNodeByPosi(12, linkedList.size());
        linkedList.insertNodeByPosi(0, 3);
        linkedList.printf();
    }
}
