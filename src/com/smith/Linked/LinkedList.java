package com.smith.Linked;


import javax.print.DocFlavor;

/**
 * 链表实现
 */
public class LinkedList<E> {


    /**
     * 内部类 链表节点
     */
    private class Node {
        public E e;
        public Node next;

        public Node() {
            new Node(null, null);
        }

        public Node(E e) {
            new Node(e, null);
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头部添加元素
     *
     * @param e e
     */
    public void addFirst(E e) {
        Node node = new Node(e, null);
        node.next = head;
        head = node;
        size++;
    }


    /**
     * 在链表指定位置插入元素
     * @param e
     * @param index
     */
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add fail,index > 0 && index < size ");
        }
        if(index == 0){
            addFirst(e);
        }else {
            Node node = new Node(e, null);
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    /**
     * 在链表尾部增加元素
     * @param e
     */
    public void addLast(E e){
        add(e,size - 1);
    }

    public E get(int index){
        Node cur = head;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    @Override
    public String toString(){
        Node cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null){
            sb.append(cur.e + " -> ");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();

    }


}
