package com.juliocode.services;

import com.juliocode.model.User;

public class UserServices {

    private User user = new User(3, "Julio");

    public Boolean calc() {
        if (user.getNumero() == 3) {
            return true;
        } else {
            return false;
        }

    }

    public int getNumber() {

        return user.getNumero();
    }

    public String getName() {
        return user.getName();
    }

    public String userData() {
        return "" + user.getNumero() + user.getName();
    }

}
