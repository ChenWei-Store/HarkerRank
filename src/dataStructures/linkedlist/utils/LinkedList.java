package dataStructures.linkedlist.utils;

/**
 * Created by chenw on 2017/6/24.
 */
public class LinkedList {
    private int count;
    private Node head;
    private Node lastNode;
    public LinkedList(){
        head = new Node();
    }

    public LinkedList(int element){
        head = new Node();
        head.data = element;
        lastNode = head;
        count++;
    }

    public void insertLast(int element){
        if(count == 0){
            head.data = element;
            lastNode = head;
        }else{
            Node node = new Node();
            node.data = element;
            lastNode.next = node;
            lastNode = node;
        }

        count++;
    }

    public void insertFirst(int element){
        if(count == 0){
            head.data = element;
            lastNode = head;
        }else {
            Node node = new Node();
            node.data = element;
            node.next = head;
            head = node;
        }

        count++;
    }

    /**
     *
     * @param element
     * @param posi 1 - n
     */
    public void insertNodeByPosi(int element, int posi){
        if(posi < 1 || posi > count + 1){
            throw new IllegalArgumentException("参数错误");
        }

        if(head == null){
           insertFirst(element);
        }else if(posi == count + 1){
          insertLast(element);
        }else{
            Node insertNode = new Node();
            insertNode.data = element;
            Node preNode = getPreNode(posi);
            insertNode.next = preNode.next;
            preNode.next = insertNode;
            count++;
        }
    }

    /**
     *
     * @param posi 1 - n
     */
    public void remove(int posi){
        if(posi < 1 || posi > count){
            throw new IllegalArgumentException("参数错误");
        }

        if(posi == 1){
            Node deleteNode = head;
            head = head.next;
            deleteNode = null;
        }else {

            Node preNode = getPreNode(posi);
            Node deleteNode = preNode.next;
            preNode.next = deleteNode.next;
            if (count == posi) {
                lastNode = preNode;
            }
            deleteNode = null;
        }
        count--;
    }

    public void printf(){
        Node node = head;

        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private Node getPreNode(int posi){
        Node preNode = head;
        for(int i = 0; i < posi - 1 - 1; i++){
            preNode = preNode.next;
        }

        return preNode;
    }

    public int size(){
        return count;
    }


    class Node{
        int data;
        Node next;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
