package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class DeleteLinkedList
{

    public ListNode deleteElementAtStart(ListNode listNode) throws Exception
    {
        if(listNode != null)
        {
            ListNode temp = listNode;
            temp = temp.getNext();
            return temp;
        }
        else
        {
            throw new Exception("List cannot be null");
        }

    }

    public ListNode deleteElementAtEnd(ListNode listNode) throws Exception
    {
        if(listNode != null)
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
        else
        {
            throw new Exception("List cannot be null");
        }

    }

    public ListNode deleteElementByData(ListNode listNode, String input) throws Exception
    {
     
        if(listNode != null)
        {
            ListNode temp = listNode;
            ListNode previous = null;
            if(temp.getData().equals(input))
            {
                listNode = temp.getNext();
            }
            else
            {
            while(temp != null)
            {
                if(temp.getData().equals(input))
                {
                    previous.setNext(temp.getNext());
                }
                previous = temp;
                temp = temp.getNext();
            }
            }
            return listNode; 
        }
        else
        {
            throw new Exception("List cannot be null");
        }
    }

}
