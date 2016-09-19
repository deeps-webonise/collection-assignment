package com.webonise.collectionAssignment;

import java.util.Scanner;

public class TestMain {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to use ArrayList\n Press 2 for Hash Set\n Press 3 for Hash Map");
        int choice=scanner.nextInt();
        if(choice == 1 ) {
            ICollectionMenu collectionMenu = new AList(); //Type Compatibility
            collectionMenu.useCollectionToDisplayData();
        }

        else if(choice == 2) {
            ICollectionMenu collectionMenu = new HSet(); //Type Compatibility
            collectionMenu.useCollectionToDisplayData();
        }

        else if (choice ==3){
            ICollectionMenu collectionMenu = new HMap(); //Type Compatibility
            collectionMenu.useCollectionToDisplayData();
        }

        else {
            System.out.println("Wrong choice");
            return;
        }



    }
    }