package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class AddLinkedList
{

    public ListNode addLinkedList(ListNode listNode, String data)
    {
        if (listNode == null)
        {
            listNode = new ListNode();
            listNode.setData(data);
            listNode.setNext(null);
        }
        else
        {
            ListNode temp = listNode;

            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }

            ListNode newNode = new ListNode();
            newNode.setNext(null);
            newNode.setData(data);
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
                    ListNode newNode = new ListNode();
                    newNode.setData(data);
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
}
