package dataStructures.linkedlist.utils;

import dataStructures.linkedlist.utils.LinkedList.Node;


/**
 * Created by chenw on 2017/6/25.
 */
public class ReverseUtils {
    public static void reverse(LinkedList linkedList){
        if(linkedList == null){
            return ;
        }

        Node head = linkedList.getHead();
        if(head == null){
            return;
        }

        reverse(head);
    }

    private static void reverse(Node node){
        if(node == null){
            return;
        }

        reverse(node.next);
        System.out.println(node.data);

    }

    /**
     * 1->2->3->4->5
     * -------------
     * 2->1->3->4->5
     * 3->2->1->4->5
     * 4->3->2->1->5
     * 5->4->3->2->1
     * @param linkedList
     */
    public static void reverse2(LinkedList linkedList){
        Node head = linkedList.getHead();  //实际变换过程中的头部
        Node node = head;  // 未进行数组倒置时的头部
        Node tempNode = null; //变换过程中被处理的节点
        while(node.next != null){
            tempNode = node.next;
            node.next = tempNode.next;
            tempNode.next = head;
            head = tempNode;
        }

        linkedList.setHead(head);
        linkedList.printf();
    }

}
