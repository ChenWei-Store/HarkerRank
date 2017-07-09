package dataStructures.linkedlist.utils;

import dataStructures.linkedlist.model.LinkedList;

/**
 * Created by chenw on 2017/7/9.
 */
public class CheckCycleUtils {
    public boolean isCycle(LinkedList.Node head) {
        LinkedList.Node firstNode = head;
        LinkedList.Node lastNode = head;
        while (firstNode.next != null && firstNode.next.next != null) {
            firstNode = firstNode.next.next;
            lastNode = lastNode.next;
            if (firstNode == lastNode){
                return true;
            }
        }
        return false;
    }
}
