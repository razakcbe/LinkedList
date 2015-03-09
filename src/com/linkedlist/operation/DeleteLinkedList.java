package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class DeleteLinkedList
{

    public ListNode deleteElementAtStart(ListNode listNode)
    {
        ListNode temp = listNode;

        if (temp != null)
        {
            temp = temp.getNext();
        }
        else
        {
            System.out.println("List cannot be null");
        }
        return temp;
    }

    public ListNode deleteElementAtEnd(ListNode listNode)
    {
        if (listNode != null)
        {
            ListNode temp = listNode;
            ListNode previous = null;
            while (temp.getNext() != null)
            {
                previous = temp;
                temp = temp.getNext();
            }
            previous.setNext(null);
        }
        else
        {
            System.out.println("List cannot be null");
        }
        return listNode;
    }

    public ListNode deleteElementByData(ListNode listNode, String input)
    {

        if (listNode != null)
        {
            ListNode temp = listNode;
            ListNode previous = null;
            if (temp.getData().equals(input))
            {
                listNode = temp.getNext();
            }
            else
            {
                while (temp != null)
                {
                    if (temp.getData().equals(input))
                    {
                        previous.setNext(temp.getNext());
                    }
                    previous = temp;
                    temp = temp.getNext();
                }
            }
        }
        else
        {
            System.out.println("List cannot be null");
        }

        return listNode;
    }

}
