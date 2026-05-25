/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.message;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Message.
     */
    @Test
    public void testmessageNumber() {
      int messageNumber = "totalMessagesSent++";  
    }
    
    @Test
    public void tsetmessageHash() {
        String messageHash = "messageID.substring(0, 2) + \":\" +\n" +
"                messageNumber + \":\" +\n" +
"                firstWord + lastWord;";
    }    
    @Test
    public void testmessageID() {
         String messageID = ("choose a option for your messagee: ");
           System.out.println("1. message sent");
           System.out.println("2. disregard message");
           System.out.println("3. store to send later");
           System.out.println("0. delete message");
           System.out.println("choose: ");
   
    }       
    @Test
    public void testrecipient() {
         String recipient = ("enter recipient number with international code and max 10 chars");
    }
                
                
    }
   
