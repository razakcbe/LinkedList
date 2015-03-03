package com.linkedlist.main;

import java.util.Scanner;

import com.linkedlist.domain.ListNode;
import com.linkedlist.operation.AddLinkedList;
import com.linkedlist.operation.DeleteLinkedList;

public class LinkedListMain
{
    public static void main(String[] args)
    {
        String choice;
        String postionData;
        String input;
        String exitVariable;
        ListNode listNode = null;
        
        AddLinkedList addLinkedList = new AddLinkedList();
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Add");
        System.out.println("Press 2 for Add in the Middle");
        System.out.println("Press 3 for Delete at the start");
        System.out.println("Press 4 for Delete at the end");
        System.out.println("Press 5 for Delete Middle element");
        do
        {
            System.out.println("Please Enter your choice");
            choice = in.nextLine();
            switch (Integer.parseInt(choice))
            {
            case 1:
                System.out.println("Please Enter your Name");
                input = in.nextLine();
                listNode = addLinkedList.addLinkedList(listNode, input);
                addLinkedList.displayLinkedList(listNode);
                break;
            case 2:
                System.out.println("Please Enter your Name");
                input = in.nextLine();
                System.out.println("Please Enter your postion data");
                postionData = in.nextLine();
                listNode = addLinkedList.addInMiddle(listNode, input, postionData);
                addLinkedList.displayLinkedList(listNode);
                break;
            case 3:
                listNode = deleteLinkedList.deleteElementAtStart(listNode);
                addLinkedList.displayLinkedList(listNode);
                break;
            case 4:
                listNode = deleteLinkedList.deleteElementAtEnd(listNode);
                addLinkedList.displayLinkedList(listNode);
                break;
            case 5:
                System.out.println("Please enter name to delete");
                input = in.nextLine();
                listNode = deleteLinkedList.deleteElementByData(listNode,input);
                addLinkedList.displayLinkedList(listNode);
                break;
            default:
                break;
            }

            System.out.println("Please Y to continue/ N to Terminate");
            exitVariable = in.nextLine();
        }
        while (exitVariable.equals("Y"));
    }

}
