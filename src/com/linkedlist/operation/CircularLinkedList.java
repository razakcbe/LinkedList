package com.linkedlist.operation;

import java.util.Hashtable;

import com.linkedlist.domain.ListNode;

public class CircularLinkedList
{

    ListNode root;

    public ListNode addAtStart(ListNode listNode, String input)
    {
        root = listNode;

        if (listNode == null)
        {

            listNode = new ListNode(input);

            root = listNode;

            listNode.setNext(root);
        }
        else
        {
            ListNode newNode = new ListNode(input);

            while (listNode.getNext() != root)
            {
                listNode = listNode.getNext();
            }

            listNode.setNext(newNode);
            newNode.setNext(root);
        }
        return listNode;
    }

    public void displayCircularLinkedList(ListNode listNode)
    {
        while (listNode.getNext() != root)
        {
            System.out.println(listNode.getData() + "-->");

            listNode = listNode.getNext();

        }
    }

    public void detectLoop(ListNode listNode)
    {
        ListNode slow = listNode;
        ListNode fast = listNode;
        while (slow != null && fast != null)
        {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (slow == fast)
            {
                System.out.println("FOUND LOOP");
                break;
            }
        }
    }
    
    public void detectLoopUsingHashTable(ListNode listNode)
    {
        ListNode current = listNode;
        Hashtable<Object,String> add = new Hashtable<Object,String>();
        while(current != null)
        {
            if(add.containsKey(current))
            {
                System.out.println("FOUND LOOP");
                break;
            }
            else
            {
                add.put(current, current.getData());
                current = current.getNext();
            }
        }
    }
}
