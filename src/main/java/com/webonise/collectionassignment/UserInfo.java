package com.webonise.collectionassignment;

public class UserInfo {
    private String userName;
    private String name;
    private String email;
    double age;


    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || (object.getClass() != this.getClass()))
            return false;

        UserInfo userInfo = (UserInfo) object;

        return age == userInfo.age && (userName == userInfo.userName || (userName != null && userName.equals(userInfo.userName)));

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) age;
        hash = 31 * hash + (null == userName ? 0 : userName.hashCode());
        return hash;
    }
}

