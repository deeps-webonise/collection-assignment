package com.webonise.collectionAssignment;

import java.util.Scanner;

public class TestMain {

    public static void main(String args[]) {

        CollectionMenu collectionMenu=new CollectionMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to use ArrayList\n Press 2 for Hash Map\n Press 3 for Hash Set");
        int choice=scanner.nextInt();
        if(choice == 1 )
            collectionMenu.ArrList();
        else if(choice == 2)
            collectionMenu.HMap();
        else if (choice ==3)
            collectionMenu.HSet();
        else {
            System.out.println("Wrong choice");
            return;
        }



    }
    }