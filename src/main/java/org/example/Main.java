package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean programRunning = true;

        System.out.println("Hello world!Welcome To Caeser Cipher");
        while (programRunning){
            System.out.println("Please choose between encryption or decryption or exit");
            String userMessage = scanner.nextLine();
            if (userMessage.equals("encryption")){
                System.out.println("Enter word to be encrypted");
                String messageToBeEncrypted = scanner.nextLine();
                System.out.println("Please enter the a number between 1 to 25");
                int userKey = Integer.parseInt(scanner.nextLine());


                Encryption message = new Encryption(messageToBeEncrypted, userKey);
                message.setmUserMessaage(messageToBeEncrypted);
                message.setmUserKey(userKey);
                System.out.println("Your encrypted message is " + message.encryptMessage());

            }else if (userMessage.equals("decryption")) {
                System.out.println("Enter word to be decrypted");
                String messageToBeDecrypted = scanner.nextLine();
                System.out.println("Please enter the a number between 1 to 25");
                int userKey = Integer.parseInt(scanner.nextLine());


                Decryption message = new Decryption(messageToBeDecrypted, userKey);
                message.setmUserMessaage(messageToBeDecrypted);
                message.setmUserKey(userKey);
                System.out.println("Your decrypted message is " + message.decryptMessage());

            }else if (userMessage.equals("exit")) {
                programRunning = false;

            }
        }

    }
}