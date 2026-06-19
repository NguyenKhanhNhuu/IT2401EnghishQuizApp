package com.nguyenkhanhnhu.utils;


import javafx.scene.control.Alert;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;
    private Alert alert;
    
    private MyAlertSingleton () {
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("QuizzApp");
        alert.setHeaderText("QuizzApp");
        
    }
    
    public static MyAlertSingleton getInstance() {
        if (instance == null ) 
            instance = new MyAlertSingleton();
        return instance;          
    }
    
    public void showMsg(String content) {
        this.alert.setContentText(content);
        this.alert.show();
    }
}
