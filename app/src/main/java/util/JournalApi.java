package util;

import android.app.Application;

//global access for username and Id
public class JournalApi extends Application {
    private String username;
    private String userId;
    private static JournalApi instance;

//returns instance
    public static JournalApi getInstance() {
        if (instance == null)
            instance = new JournalApi();
        return instance;
    }

    public JournalApi() {}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
