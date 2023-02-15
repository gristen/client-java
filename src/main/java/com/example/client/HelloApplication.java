package com.example.client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static boolean showPersonEditDialog() {
        try {
// Загрузка fxml создание сцены для всплывающего окна.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation (HelloApplication.class.getResource("add.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
// Создание окна Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Редактирование книги");
            dialogStage.initModality (Modality.WINDOW_MODAL);
            Scene scene = new Scene (page);
            dialogStage.setScene(scene);
            dialogStage.showAndWait();
            return true;// пока будем просто возвращать истину для проверки работоспособности
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }




    public static void main(String[] args) {
        launch();
    }
}