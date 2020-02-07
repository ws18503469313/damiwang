package com.cloud.model;

import java.io.Serializable;

public class UserAddress implements Serializable {

    private static final long serialVersionUID = -3873615066572050670L;

    private Long id;

    private String userId;

    private String receiver;

    private String phoneNum;

    private String address;

    private Boolean isDefault;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public UserAddress() {
    }

    public UserAddress(Long id, String userId, String receiver, String phoneNum, String address, Boolean isDefault) {
        this.id = id;
        this.userId = userId;
        this.receiver = receiver;
        this.phoneNum = phoneNum;
        this.address = address;
        this.isDefault = isDefault;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
