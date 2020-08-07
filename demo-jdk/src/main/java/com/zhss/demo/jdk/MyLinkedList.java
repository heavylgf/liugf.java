package com.zhss.demo.jdk;

import java.util.NoSuchElementException;

/**
 * Created by CTWLPC on 2018/11/1.
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {

    }

    /**
     * 尾部新增元素
     *
     * @param
     * @return
     */
    public boolean addLast(Object item) {

        Node l = last;

        Node newNode = new Node(l, item, null);

        last = newNode;

        if (l == null) {
            first = newNode;
        } else {
            l.setNext(newNode);
        }
        size++;
        return true;
    }

    /**
     * 头部新增元素
     *
     * @param item
     * @return
     */
    public boolean addFirst(Object item) {
        Node f = first;
        Node newNode = new Node(null, item, f);
        if (f == null) {
            last = newNode;
        } else {
            f.setPrev(newNode);
        }

        first = newNode;
        size++;
        return true;
    }

    /**
     * 新增元素
     *
     * @param item
     * @return
     */

    public boolean add(Object item) {

        return addLast(item);

    }

    /**
     * 指定位置新增元素
     *
     * @param index
     * @param
     * @return
     */
    public boolean add(int index, Object item) {
        checkElementIndex(index);
        if (index == 0) {
            return addFirst(item);
        }

        if (index == size - 1) {

            return addLast(item);

        }

        Node oldNode = node(index);

        Node f = oldNode.getPrev();

        Node node = new Node(f, item, oldNode);

        f.setNext(node);

        oldNode.setPrev(node);

        size++;

        return true;

    }

    /**
     * 移除第一个元素
     */

    public Object removeFirst() {

        if (first == null) {
            throw new NoSuchElementException();
        }

        Object oldItem = first.getItem();
        Node l = first.getNext();
        first.setNext(null);
        first.setItem(null);
        l.setPrev(null);
        size--;
        return oldItem;

    }

    /**
     * 移除最后一个元素
     *
     * @return
     */
    public Object removeLast() {
        if (last == null) {
            throw new NoSuchElementException();
        }
        Object oldItem = last.getItem();

        Node f = last.getPrev();
        last.setPrev(null);
        last.setItem(null);
        f.setNext(null);
        size--;
        return oldItem;
    }

    /**
     * 删除指定位置元素
     *
     * @param index
     * @return
     */
    public Object remove(int index) {
        // 检查是否越界
        checkElementIndex(index);
        Node node = node(index);
        Object oldItem = node.getItem();

        Node f = node.getPrev();

        Node l = node.getNext();

        node.setPrev(null);

        node.setItem(null);

        node.setNext(null);

        f.setNext(l);

        l.setPrev(f);

        size--;

        return oldItem;

    }

    /**
     * 更新元素
     *
     * @param index
     * @param item
     * @return
     */
    public Object set(int index, Object item) {
        // 检查是否越界
        checkElementIndex(index);
        Node oldNode = node(index);
        Object oldItem = oldNode.getItem();
        Node f = oldNode.getPrev();
        Node l = oldNode.getNext();
        Node newNode = new Node(f, item, l);
        oldNode.setPrev(null);

        oldNode.setNext(null);
        oldNode.setItem(null); // heap gc
        f.setNext(newNode);
        l.setPrev(newNode);
        return oldItem;
    }

    /**
     * 获取元素
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        // 检查是否越界
        checkElementIndex(index);
        Node node = node(index);
        return node.getItem();
    }

    /**
     * 集合长度
     *
     * @return
     */
    public int size() {
        return size;
    }

    /*
     * 获取到index位置的节点
     */
    private Node node(int index) {
        // 如果index在前半部分，从first开始检索
        if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++) {
                x = x.getNext();
            }
            return x;
        }
        // 否则从last开始往回检索
        else {
            Node x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.getPrev();
            }
            return x;
        }
    }

    /**
     * 检查是否越界
     *
     * @param index
     */
    private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        StringBuilder resultStr = new StringBuilder();
        resultStr.append("[");
        Node x = first;
        for (int i = 0; i < size; i++) {
            if (resultStr.length() == 1) {
                resultStr.append(x.getItem());
            } else {
                x = x.getNext();
                resultStr.append(",").append(x.getItem());
            }
        }
        resultStr.append("]");
        return resultStr.toString();
    }
}

class Node {
    private Node prev;
    private Object item;
    private Node next;

    public Node(Node prev, Object item, Node next) {
        super();
        this.prev = prev;
        this.item = item;
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
