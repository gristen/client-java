module com.example.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires lombok;

    opens com.example.client to javafx.fxml;
    exports com.example.client;
    exports com.example.client.controller;
    exports com.example.client.Entity;
    exports com.example.client.response;
    exports com.example.client.sevice;
    exports com.example.client.utils;
    opens com.example.client.controller to javafx.fxml;
}