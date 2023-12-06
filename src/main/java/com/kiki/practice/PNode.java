package com.kiki.practice;

import com.kiki.entity.DoubleNode;
import com.kiki.entity.Node;

/**
 * @author Aurelia
 * @date 2023-12-06 15:39
 * 单向链表与双向链表相关练习
 */
public class PNode {
    /**
     * 单向链表反转
     * 传入原始单向链表的头节点,返回新头部的节点
     * @return
     */
    public Node reverseNode(Node head) {
        Node pre = null;
        Node next = null;

        // 单向链表反转思路，将指针指向前一个链表
        while(head != null) {
            next = head.next;// 记录初始链表的下一个指针以保证当前节点改完能继续往后跳
            head.next = pre;// 将下一个指针指向前一个节点
            pre = head;// 记录下个节点对应的前一个节点的位置
            head = next;// head下移一个位置
        }

        return pre;
    }

    /**
     * 反转双向链表
     * @param head
     * @return
     */
    public DoubleNode reverseDoubleNode(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;

        while(head != null) {
            // 记录反转前下一个指针位置以保证反转后能跳到下一步
            next = head.next;

            // 反转指针
            head.next = pre;
            head.pre = next;

            // 移动位置
            pre = head;
            head = next;
        }

        return pre;
    }

    /**
     * 给定一个单链表头节点head和一个特定值value
     * 删除节点值=num的节点返回新的头节点
     * @param head
     * @param num
     * @return
     */
    public Node removeNode(Node head, int num) {
        // 先遍历链表，将头部值为num的情况处理掉
        while (head != null) {
            if (head.value != num) {
                break;
            }

            head = head.next;
        }

        // 上述处理过程后得到的是头节点一定不为num的链表，最终需要把这个头节点返回，因此后续处理时需要重新定义变量接收head
        Node cur = head;
        Node pre = head;

        while(cur != null) {
            if(cur.value == num) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
