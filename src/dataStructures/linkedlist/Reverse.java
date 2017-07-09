package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;
import dataStructures.linkedlist.utils.ReverseUtils;

/**
 * Created by chenw on 2017/6/25.
 */
public class Reverse {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.printf();
        System.out.println("--------------------------");

        ReverseUtils.reverse(linkedList);
        System.out.println("--------------------------");
        ReverseUtils.reverse2(linkedList);
    }
}
