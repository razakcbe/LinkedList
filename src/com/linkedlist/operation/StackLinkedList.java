package com.linkedlist.operation;

import com.linkedlist.domain.ListNode;

public class StackLinkedList
{

    public ListNode pushStackLinkedList(ListNode listNode, String input, int maxSize)
    {
        int size = getLinkedListSize(listNode);

        if (listNode == null)
        {
            listNode = new ListNode(input);
        }
        else
        {
            if (size < maxSize)
            {
                ListNode temp = listNode;
                        
                ListNode newNode = new ListNode(input);
                
                while (temp.getNext() != null)
                {
                    temp = temp.getNext();
                }
                
                temp.setNext(newNode);
            }
            else
            {
                System.out.println("STACK IS FULL");
            }
        }
        return listNode;
    }

    private int getLinkedListSize(ListNode listNode)
    {
        int count = 0;

        while (listNode != null)
        {
            count = count + 1;
            listNode = listNode.getNext();
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
    
    public void displayLinkedList(ListNode listNode)
    {
        while(listNode != null)
        {
            System.out.print(listNode.getData()+"-->");
            listNode = listNode .getNext();
        }
    }
}
