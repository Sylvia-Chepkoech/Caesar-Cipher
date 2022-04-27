package org.example;

public class Decryption {

    private String mUserMessage;
    private int mUserKey;

    public Decryption(String userMessage, int userKey) {
        this.mUserMessage = userMessage;
        this.mUserKey = userKey;
    }
    public String getmUserMessage() {
        return mUserMessage;
    }

    public void setmUserMessaage(String mUserMessaage) {
        this.mUserMessage = mUserMessaage;
    }

    public int getmUserKey() {
        return mUserKey;
    }

    public void setmUserKey(int mUserKey) {
        this.mUserKey = mUserKey;
    }
    public String decryptMessage() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder decryptedMessage = new StringBuilder();
        String userMessage = getmUserMessage().toUpperCase();
        char[] userMessageArray = userMessage.toCharArray();
        int userKey = getmUserKey();

        for (char b:userMessageArray) {
            if (Character.isLetter(b)) {
                int characterPosition = alphabet.indexOf(b);

                if (characterPosition != -1){
                    int newCharacterPosition = (characterPosition - userKey) % 26;
                    char encryptedLetter = alphabet.charAt(newCharacterPosition);
                    decryptedMessage.append(encryptedLetter);
                }else {
                    int newCharacterPosition = (characterPosition - userKey) + 26;
                    char encryptedLetter = alphabet.charAt(newCharacterPosition);
                    decryptedMessage.append(encryptedLetter);
                }


            }else {
                decryptedMessage.append(b);
            }
        }

        return decryptedMessage.toString();
    }


}


