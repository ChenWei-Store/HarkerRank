package dataStructures.linkedlist.model;


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

    public class Node{
        public int data;
        public Node next;
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

    public void removeRepeatData(){
        Node node = head;
        int data = head.data;

        while (node.next != null){
            Node nextNode = node.next;
            if(nextNode.data == data){
                node.next = nextNode.next;
                count--;
            }else{
                data = nextNode.data;
                node = nextNode;
            }
        }


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

    /**
     *
     * @param posi 1 - n
     * @return
     */
    private Node getNode(int posi){
        Node node = head;
        for(int i = 0; i < posi - 1; i++){
            node = node.next;
        }
        return node;
    }

    public int getNodeData(int posi){
        return getNode(posi).data;
    }

    /**
     *
     * @param tailPosi 倒数第tailPosi个数
     * @return
     */
    public int getNodeFromTailPosition(int tailPosi){
        int posi = count - tailPosi + 1;
        return getNodeData(posi);
    }

    public int size(){
        return count;
    }



    @Override
    public boolean equals(Object obj) {
        LinkedList linkedList = (LinkedList)obj;
        if(linkedList.size() != this.size()){
            return false;
        }

        Node thisNode = head;
        Node anNode = linkedList.head;
        while (thisNode != null){
            if(thisNode.data != anNode.data){
                return false;
            }
            thisNode = thisNode.next;
            anNode = anNode.next;

        }

        return true;
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
