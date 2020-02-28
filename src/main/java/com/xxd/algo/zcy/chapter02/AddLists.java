package com.xxd.algo.zcy.chapter02;

import java.util.Stack;

/**
 * @Author: XiaoDong.Xie
 * @DateTime: 2020/2/28 17:59
 * @Description: 两个链表相加 P66
 */
public class AddLists {

    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(3);
        head1.next.next = new Node(7);

        Node head2 = new Node(6);
        head2.next = new Node(3);

        Node resultNode = addLists1(head1, head2);

        while (resultNode != null) {
            System.out.print(resultNode.value + " -> ");
            resultNode = resultNode.next;
        }

    }
    public static Node addLists1(Node head1, Node head2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (head1 != null) {
            s1.push(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            s2.push(head2.value);
            head2 = head2.next;
        }

        // 进位
        int carry = 0;
        int n1 = 0;
        int n2 = 0;
        int n = 0;

        Node node = null;

        Node pre = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            n1 = s1.isEmpty() ? 0 : s1.pop();
            n2 = s2.isEmpty() ? 0 : s2.pop();

            n = n1 + n2 + carry;
            pre = node;
            node = new Node(n % 10);
            node.next = pre;
            carry = n / 10;
        }

        if (carry == 1) {
            pre = node;
            node = new Node(1);
            node.next = pre;
        }

        return node;
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

}
