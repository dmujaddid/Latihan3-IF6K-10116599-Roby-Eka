package com.apps.rizkiadam.latihansharedpreferences.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.apps.rizkiadam.R;

public class UserModel {

    // Tanggal  : Kamis, 30 April 2020
    // Descjob  : Mengerjakan kelas Register, UserModel, Preferences, UtilStatic

    // Tanggal  : Jumat, 1 Mei 2020
    // Descjob  : Mengerjakan kelas LoginActivity, HomeActivity
    //            layout, drawable, values

    // NIM      : 10116599
    // Nama     : Robby Eka
    // Kelas    : IF6K


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
