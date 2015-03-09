package com.linkedlist.main;

import java.util.Scanner;

import com.linkedlist.domain.ListNode;
import com.linkedlist.operation.StackLinkedList;

public class StackLinkedListMain
{

    public static void main(String[] args)
    {
        ListNode listNode = null;
        StackLinkedList stackLinkedList = new StackLinkedList();
        String conti, stackSize, input, choice = null;
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        stackSize = scanner.nextLine();
        size = Integer.parseInt(stackSize);
        do
        {
            System.out.println("Press 1 for PUSH");
            System.out.println("Press 2 for POP");
            choice = scanner.nextLine();
            switch (Integer.parseInt(choice))
            {
            case 1:
                System.out.println("Enter the data");
                input = scanner.nextLine();
                listNode = stackLinkedList.pushStackLinkedList(listNode, input, size);
                stackLinkedList.displayLinkedList(listNode);
                break;
            case 2:
                break;
            default:
                break;
            }
            System.out.println("Press Y/N to continue/Exit");
            conti = scanner.nextLine();
        }
        while (conti.equals("Y"));
    }

}
