/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.message;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class Message {

    public static void main(String[] args) {
        
        String messageID;
        int messageNumber;
        String recipient;
        String messageText;
        String messageHash;
        
        int totalMessagesSent = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Login
        System.out.print("Enter your username");
        String username = scanner.nextLine();
        System.out.print("Enter your password");
        String password = scanner.nextLine();
        
        if (username.contains("_") && password.contains(" $ "))
        {
            System.out.println("successfully logged in");
        }
        else
        {
            System.out.println("wrong username or password, please re-enter");
        }
        
        System.out.println("New Message");
        
    
        //confirm recipient number (max 10 char, include international code)
        recipient = "";
        while (true)
        {
            System.out.print("enter recipient number with international code and max 10 chars");
            recipient = scanner.nextLine().trim();
            if (recipient.length()<=10 && recipient.startsWith("+"))
            {
                break;
            }
            System.out.println("Error: recipient must be 10 characters or less and must include an international code");
            }
        
        //message confirmation (max 250 char)
        String message = "";
        while (true)
        {
            System.out.print("enter your message (250 char): ");
            message = scanner.nextLine().trim();
            if (message.length()<= 250)
            {
                System.out.println("message is correct");
                break;
            }
            else
            {
                System.out.println("please enter a message of less then 250 characters");
            }
           
            //create a message ID (10 random numbers)
           long messageid = 100000000L + (long) (random.nextDouble() * 9000000000L);
           
           // message options
           System.out.println("choose a option for your messagee: ");
           System.out.println("1. message sent");
           System.out.println("2. disregard message");
           System.out.println("3. store to send later");
           System.out.println("0. delete message");
           System.out.println("choose: ");
           String action = scanner.nextLine().trim();
           
           //stored masseges
           totalMessagesSent++;
           
           // show detalis in order
           System.out.println("message details");
           System.out.println("message ID: " + messageid);
           System.out.println("message Hash: " + messageHash);
           System.out.println("recipient: " + recipient);
           System.out.println("message: " + message);
           
           // change massage to JSON formet
           String toJSON()
           {
                return "{\n" +
                "  \"MessageID\": \"" + messageID + "\",\n" +
                "  \"MessageHash\": \"" + messageHash + "\",\n" +
                "  \"Recipient\": \"" + recipient + "\",\n" +
                "  \"Message\": \"" + messageText + "\"\n" +
                "}";
           }
           
           if (action.equals("3"))
           {
               System.out.println("Status: message successfully stored");
           }
           else
           {
               System.out.println("Status: message successfully sent");
           }
           
           //first two numbers of the message ID
           String idStr = String.valueOf(messageID);
           String firstTwoID = idStr.substring(0, 2);
           
           // Create message hash
           String[] words = message.split("\\s+");
           String firstWord = words.length > 0 ? words[0] : "";
           String lastWord = words.length > 0 ? words[words.length - 1] : "";
       
            return messageID.substring(0, 2) + ":" +
                messageNumber + ":" +
                firstWord + lastWord;
            
            
            
    
           
           
           
           
           
           
           
           
           
           
                   
           
           
        }
    
    
    }
}
