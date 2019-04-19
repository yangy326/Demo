package com.example.yangyang.demo.TestData;

public class follow {
    String time;

    String username;

    int isvoice;

    int isgetphone;

    int islabel;

    String label;

    String comment;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIsvoice() {
        return isvoice;
    }

    public void setIsvoice(int isvoice) {
        this.isvoice = isvoice;
    }

    public int getIsgetphone() {
        return isgetphone;
    }

    public void setIsgetphone(int isgetphone) {
        this.isgetphone = isgetphone;
    }

    public int getIslabel() {
        return islabel;
    }

    public void setIslabel(int islabel) {
        this.islabel = islabel;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public follow(String time, String username, int isvoice, int isgetphone, int islabel, String label, String comment) {
        this.time = time;
        this.username = username;
        this.isvoice = isvoice;
        this.isgetphone = isgetphone;
        this.islabel = islabel;
        this.label = label;
        this.comment = comment;
    }
}
