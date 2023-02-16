module com.example.client {



    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.google.gson;
    requires okhttp3;
    requires static lombok;
    requires annotations;

    opens com.example.client to javafx.fxml;
    exports com.example.client;

    exports com.example.client.controller;
    exports com.example.client.Entity;
    exports com.example.client.response;
    exports com.example.client.sevice;
    exports com.example.client.utils;

    opens com.example.client.controller to javafx.fxml;
    opens com.example.client.Entity to com.google.gson;
    opens com.example.client.response to com.google.gson;

}