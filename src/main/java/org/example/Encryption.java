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

}
