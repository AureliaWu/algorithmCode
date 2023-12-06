package com.kiki.entity;

/**
 * @author Aurelia
 * @date 2023-12-06 15:30
 * 单向链表
 */
public class Node {
    public int value;// 当前节点的值
    public Node next;// 指向下一节点的指针

    public Node(int value) {
        this.value = value;
    }
}
