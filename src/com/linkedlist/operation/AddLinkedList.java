package com.linkedlist.operation;

import java.util.Stack;

import com.linkedlist.domain.ListNode;

public class AddLinkedList
{

    public ListNode addLinkedList(ListNode listNode, String data)
    {
        if (listNode == null)
        {
            listNode = new ListNode(data);
        }
        else
        {
            ListNode temp = listNode;

            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }

            ListNode newNode = new ListNode(data);
            temp.setNext(newNode);
        }

        return listNode;
    }

    public ListNode addInMiddle(ListNode listNode, String data, String postionData)
    {
        if (listNode == null)
        {
            // throw Exception("listNode");
        }
        else
        {
            ListNode temp = listNode;

            while (temp != null)
            {
                if (postionData.equals(temp.getData()))
                {
                    ListNode newNode = new ListNode(data);
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                }
                temp = temp.getNext();
            }
        }
        return listNode;
    }

    public void displayLinkedList(ListNode listNode)
    {
        while (listNode != null)
        {
            System.out.print(listNode.getData() + "-->");
            listNode = listNode.getNext();
        }
    }

    public ListNode reverseLinkedList(ListNode listNode)
    {
        ListNode current = listNode;
        ListNode prev = null;
        ListNode next = null;

        while (current != null)
        {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        listNode = prev;
        return listNode;
    }
    
    public void checkForPalindrome(ListNode listNode)
    {
        ListNode head = listNode;
        Stack<String> stack = new Stack<String>();
        String data = null;
        while(head != null)
        {
            stack.add(head.getData());
            head = head.getNext();
        }
        
        head = listNode;
        
        while(head != null)
        {
            data = stack.pop();
            if(data.equals(head.getData()))
            {
                head = head.getNext();
            }
            else
            {
                System.out.println("Given Linked List is not palindrome");
            }
        }
        
    }
}
