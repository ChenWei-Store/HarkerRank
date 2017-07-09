package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;

/**
 * Created by chenw on 2017/6/25.
 */
public class DeleteNode {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertNodeByPosi(3, 2);
        linkedList.insertNodeByPosi(5, 3);
        linkedList.insertFirst(5);
        linkedList.insertNodeByPosi(6, 2);
        linkedList.printf();
        System.out.println("------------------------");
        linkedList.remove(1);
        linkedList.remove(3);
        linkedList.remove(linkedList.size());
        linkedList.printf();
    }
}
