package com.alamin.esay_java;

public class LinkedListImpl {
    public static Node insert(int data, Node head){
        Node node = new Node(data);
        node.next = head;
        return node;
    }
    public static void display(Node head){
        while (head != null){
            System.out.print(head.data+",");
            head = head.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node prev = null;
        while (head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static Node middleNode(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node head){
        Node fast = head;
        Node slow = middleNode(head);
        slow = reverse(slow);
        while (slow != null){
            System.out.println("Fast data: "+fast.data+" and Slow data: "+slow.data);
            if (slow.data != fast.data){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(1, root);
        root = insert(1, root);
//        root = insert(3, root);
//        root = insert(2, root);
//        root = insert(1, root);
//        root = insert(5, root);

        display(root);
//        System.out.println(middleNode(root).data);
//        Node reverse = reverse(root);
//        display(reverse);
        System.out.println(isPalindrome(root));
    }
}
