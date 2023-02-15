package com.example.client.controller;

import com.example.client.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ApplicationController {
    @FXML
    void addBook (ActionEvent event) throws IOException
    {
        HelloApplication.showPersonEditDialog();
    }
}


