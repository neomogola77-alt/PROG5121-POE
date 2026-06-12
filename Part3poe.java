/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part3poe;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class Part3poe {

    public static void main(String[] args) {
        // Define maximum capacity for the arrays
    int Max_Messages = 250;
    
    // Paralllel Array
    String[] sentMessages = new String[Max_Messages];
    String[] disregardedMessages = new String[Max_Messages];
    String[] storedMessages = new String[Max_Messages];
    String[] messageHashes = new String[Max_Messages];
    String[]messageIds = new String[Max_Messages];
    
    String[] senders = new String[Max_Messages];
    String[] recipients = new String[Max_Messages];

    int storedCount = 0;
    int sentCount= 0;
    int disregardedCount = 0;
    
    //Main Menu
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5)
        {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Send Message");
            System.out.println("2. Disregard Message");
            System.out.println("3. Process Existing Log");
            System.out.println("4. Stored Messages (Sub-Menu)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            if (scanner.hasNextInt())
            {
                choice = scanner.nextInt();
                scanner.nextLine(); 
                
                if (choice == 4)
                {
                    storedMessages(scanner);
                } 
                else if (choice == 5)
                {
                    System.out.println("Exiting program...");
                } else
                {
                    System.out.println("Options 1-3 executed via core logic.");
                } 
            }else{
                {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                
                case 4:

    System.out.println("1. Display Senders & Recipients");
    System.out.println("2. Longest Message");
    System.out.println("3. Search Message ID");
    System.out.println("4. Search Recipient");
    System.out.println("5. Delete by Hash");
    System.out.println("6. Display Report");

    int choice = scanner.nextInt();
    scanner.nextLine();

    switch(choice)
    {
        case 1:
            displaySendersAndRecipients();
            break;

        case 2:
            displayLongestMessage();
            break;

        case 3:
            System.out.print("Enter Message ID: ");
            searchMessageID(scanner.nextLine());
            break;

        case 4:
            System.out.print("Enter Recipient: ");
            searchRecipient(scanner.nextLine());
            break;

        case 5:
            System.out.print("Enter Hash: ");
            deleteByHash(scanner.nextLine());
            break;

        case 6:
            displayReport();
            break;
    }
    break;
    
    //display sender and recipient
    System.out.println("\n--- Longest Stored Message ---");
        String longest = "";
        int trackingIndex = -1;
        
        for (int i = 0; i < storedCount; i++)
        {
            if (storedMessages[i] != null && storedMessages[i].length() > longest.length())
            {
                longest = storedMessages[i];
                trackingIndex = i;
    
    //Display the longest message
     String longest = "";

    for (int i = 0; i < storedCount; i++)
    {
        if (storedMessages[i].length() > longest.length())
        {
            longest = storedMessages[i];
        }
    //search for message ID
    System.out.println("Longest Message:");
    System.out.println(longest);
    
    System.out.print("Enter 10-digit Message ID to: ");
        String searchId = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < storedCount; i++) {
            if (messageIds[i] != null && messageIds[i].equals(searchId)) {
                System.out.println("\nMatch Found:");
                System.out.println("Recipient: " + recipients[i]);
                System.out.println("Message: " + storedMessages[i]);
                found = true;
                break;
            }
        }
        if (found)
        System.out.println("No message found with ID: " + searchId);
        
    //search for messages stored for a particuler recipient
    System.out.print("Enter Recipient Name: ");
        String searchRecipient = scanner.nextLine().trim();
        boolean found = false;

        System.out.println("\nMessages for " + searchRecipient + ":");
        for (int i = 0; i < storedCount; i++) {
            if (recipients[i] != null && recipients[i].equalsIgnoreCase(searchRecipient)) {
                System.out.println("- [" + messageIds[i] + "]: " + storedMessages[i]);
                found = true;
            }
        }
        if (found)
        System.out.println("No messages found for recipient: " + searchRecipient);
        
    //Delete a message using the message hash
    System.out.print("Enter Message Hash to delete: ");
        String searchHash = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < storedCount; i++) {
            if (messageHashes[i] != null && messageHashes[i].equalsIgnoreCase(searchHash)) 
            {
                System.out.println("Deleting message: '" + storedMessages[i] + "'");
        
        //Display a report that lists the full details of all the stored messages
        System.out.println("\n=================================== STORED MESSAGES REPORT ===================================");
        System.out.println("ID", "Message Content");
        System.out.println("Sender");
        System.out.println("Recipient");
        System.out.println("Hash");
        System.out.println( "Message Content");
        
        
            }
        }
        
    }
}



            
        
        
