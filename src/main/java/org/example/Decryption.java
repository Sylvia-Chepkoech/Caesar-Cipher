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

}


