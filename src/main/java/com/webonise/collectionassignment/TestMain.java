package com.webonise.collectionassignment;

import java.util.Scanner;

public class TestMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to use ArrayList\n Press 2 for Hash Set\n Press 3 for Hash Map");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ICollectionMenu arrayListCollection = new ArrayListCollection(); //Type Compatibility
                arrayListCollection.useCollectionToDisplayData();
                break;

            case 2:
                ICollectionMenu hashSetCollection = new HashSetCollection(); //Type Compatibility
                hashSetCollection.useCollectionToDisplayData();
                break;

            case 3:
                ICollectionMenu hashMapCollection = new HashMapCollection(); //Type Compatibility
                hashMapCollection.useCollectionToDisplayData();
                break;
            

            default:
                System.out.println("Invalid Choice");
                return;
        }
    }
}