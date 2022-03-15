package insert_node_specific_position;


import java.io.BufferedWriter;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.head = llist;
        SinglyLinkedListNode novo = new SinglyLinkedListNode(data);


        SinglyLinkedListNode aux = lista.head;

        if(lista.head == null){
            lista.head = novo;
            lista.tail = novo;
            return lista.head;
        }
        if(position == 0){
            //insere no inicio
            novo.next = lista.head;
            lista.head = novo;

        }else{
            SinglyLinkedListNode nodo = lista.head;
            for(int i =0; i < position-1; i++){
                nodo = nodo.next;
            }
            novo.next = nodo.next;
            nodo.next = novo;

        }
        return lista.head;


    }
}

