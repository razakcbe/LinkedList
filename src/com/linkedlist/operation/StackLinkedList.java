package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class StackLinkedList
{

    public ListNode pushStackLinkedList(ListNode listNode, String input, int maxSize)
    {
        int size = getLinkedListSize(listNode);

        if (size <= maxSize)
        {
            ListNode newNode = new ListNode(input);
            while (listNode.getNext() != null)
            {
                listNode = listNode.getNext();
            }
            listNode.setNext(newNode);
        }
        return listNode;
    }

    private int getLinkedListSize(ListNode listNode)
    {
        int count = 0;

        while (listNode != null)
        {
            listNode = listNode.getNext();
            count++;
        }
        return count;
    }

    public ListNode popStackLinkedList(ListNode listNode)
    {
        if (listNode != null)
        {
            listNode = listNode.getNext();
        }
        return listNode;
    }
}
