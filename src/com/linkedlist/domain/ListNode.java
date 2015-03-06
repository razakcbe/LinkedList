package com.linkedlist.domain;

public class ListNode
{
    private String data;
    
    private ListNode next;
    
    
    public ListNode(String data)
    {
        this.data = data;
        this.next = null;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public ListNode getNext()
    {
        return next;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }

}
