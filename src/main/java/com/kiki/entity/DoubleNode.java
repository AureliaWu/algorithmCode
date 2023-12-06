package com.kiki.entity;

/**
 * @author Aurelia
 * @date 2023-12-06 15:34
 * 双向链表
 */
public class DoubleNode {
    public int value;// 当前节点的值
    public DoubleNode pre;// 指向上一个节点的指针
    public DoubleNode next;// 指向下一个节点的指针

    public DoubleNode(int value) {
        this.value = value;
    }
}
