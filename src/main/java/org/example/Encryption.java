package org.example;

public class Encryption {

    private String mUserMessage;
    private int mUserKey;
    public Encryption(String userMessage, int userKey) {
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
    public String encryptMessage() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder encryptedMessage = new StringBuilder();
        String userMessage = getmUserMessage().toUpperCase();
        char[] userMessageArray = userMessage.toCharArray();
        int userKey = getmUserKey();

        for (char b:userMessageArray) {
            if (Character.isLetter(b)) {
                int characterPosition = alphabet.indexOf(b);
                int newCharacterPosition = (characterPosition + userKey) % 26;
                char encryptedLetter = alphabet.charAt(newCharacterPosition);
                encryptedMessage.append(encryptedLetter);
            }else {
                encryptedMessage.append(b);
            }
        }

        return encryptedMessage.toString();
    }


}
