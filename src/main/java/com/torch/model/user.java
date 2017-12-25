package com.torch.model;

public class user {
    private Integer id;

    private String userName;

    private String userId;

    private String userPass;

    private String userMail;

    public user(Integer id, String userName, String userId, String userPass, String userMail) {
        this.id = id;
        this.userName = userName;
        this.userId = userId;
        this.userPass = userPass;
        this.userMail = userMail;
    }

    public user() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }
}