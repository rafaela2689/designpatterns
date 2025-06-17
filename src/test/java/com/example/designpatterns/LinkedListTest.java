package com.example.designpatterns;

import java.util.LinkedList;

public class LinkedListTest {

     public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void test() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(3);
    }
}
