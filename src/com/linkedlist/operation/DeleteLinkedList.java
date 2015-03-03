package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class DeleteLinkedList
{

    public ListNode deleteElementAtStart(ListNode listNode)
    {
        ListNode temp = listNode;
        temp = temp.getNext();
        return temp;
    }

    public ListNode deleteElementAtEnd(ListNode listNode)
    {
        ListNode temp = listNode;
        ListNode previous = null;
        while(temp.getNext() != null)
        {
            previous = temp;
            temp = temp.getNext();
        }
        previous.setNext(null);
        return listNode;
    }

    public ListNode deleteElementByData(ListNode listNode, String input)
    {
        return listNode;
    }

}
