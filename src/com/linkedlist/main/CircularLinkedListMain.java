package com.linkedlist.main;

import java.util.Scanner;

import com.linkedlist.domain.ListNode;
import com.linkedlist.operation.CircularLinkedList;

public class CircularLinkedListMain
{

    public static void main(String[] args)
    {

        ListNode listNode = null;
        String choice, conti, input = null;
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList circularLinkedList = new CircularLinkedList();
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
                listNode = circularLinkedList.addAtStart(listNode, input);
                circularLinkedList.displayCircularLinkedList(listNode);
                break;
            case 2:
                circularLinkedList.detectLoopUsingHashTable(listNode);
                break;
            default:
                break;
            }
            System.out.println("Press Y/N to continue/Exit");
            conti = scanner.nextLine();
        }
        while (conti.equals("Y"));
        scanner.close();

    }

}
