package dataStructures.linkedlist;

import dataStructures.linkedlist.model.LinkedList;
import dataStructures.linkedlist.utils.CheckCycleUtils;

/**
 * Created by chenw on 2017/7/9.
 */
public class CycleDetection {
    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(5);
        CheckCycleUtils checkCycleUtils = new CheckCycleUtils();
        boolean result = checkCycleUtils.isCycle(linkedList.getHead());
        System.out.println(result);
    }
}
