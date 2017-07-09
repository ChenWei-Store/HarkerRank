package dataStructures.linkedlist;

import dataStructures.linkedlist.utils.GetNodeByTailUtils;
import dataStructures.linkedlist.model.LinkedList;



/**
 * Created by chenw on 2017/7/9.
 */
public class GetNodeFromTail {
    public static void main(String []args){
        int tailPosi = 3;

        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(5);
        linkedList.insertLast(4);
        linkedList.insertLast(3);
        linkedList.insertLast(2);
        linkedList.insertLast(1);
        linkedList.printf();
        int data = linkedList.getNodeFromTailPosition(3);
        System.out.println("倒数第" + tailPosi + "个数: " + data);

        System.out.println("---------------------------------------");
        GetNodeByTailUtils getNodeByTailUtils = new GetNodeByTailUtils();
        data = getNodeByTailUtils.getNodeByTailPosi(linkedList.getHead(), tailPosi);
        System.out.println("倒数第" + tailPosi + "个数: " + data);

    }
}
