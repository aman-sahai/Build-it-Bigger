package com.udacity.gradle.builditbigger.backend;

import com.example.lib.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        MyClass myClass =new MyClass();
        String as = myClass.randomJokes();
        return as;
    }

    public void setData(String data) {
        myData = data;
    }
}