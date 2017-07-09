package dataStructures.linkedlist.utils;

import dataStructures.linkedlist.model.LinkedList.Node;
/**
 * Created by chenw on 2017/7/9.
 */
public class GetNodeByTailUtils {

    /**
     *双引用 :先移动其中一个引用到一定的步长，然后同时移动2个引用，
     * 当前一个引用移动到最后一个位置时，后一个则移动到了所需的位置
     *
     * 此处步长的推倒:
     *
     * eg: 1 2 3 4 5 6
     * 倒数第3个数
     *
     * 1 2 3 (4) 5 [6]
     * 1 2 (3) 3 4 [5] 6
     * 1 (2) 3 [4] 5 6
     * (1) 2 [3] 4 5 6
     *
     * 所以前面的引用应该从头结点移动2次
     *
     * @param head
     * @param tailPosi 1 - n 倒数第tailPosi个数
     * @return
     */
    public int getNodeByTailPosi(Node head, int tailPosi){
        Node firstNode = head;
        Node lastNode = head;
        for(int i = 0; i < tailPosi - 1; i++){
            firstNode = firstNode.next;
        }
        while(firstNode.next != null){
            firstNode = firstNode.next;
            lastNode = lastNode.next;
        }

        return lastNode.data;
    }
}
