package com.apps.rizkiadam.latihansharedpreferences.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.apps.rizkiadam.R;

public class UserModel {

    // Kamis 30 April 2020
    // Robby Eka / 10116599

    private String username;
    private String password;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
