package com.sushmitha;
class RemoveDuplicates {
    public class ListNode {
        public ListNode next;
        public boolean val;
    }

    public static void main(String[] args) {
        ListNode head ;

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val ==current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }
        return head;

        
    }
}