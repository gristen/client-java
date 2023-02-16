package com.example.client.controller;

import com.example.client.Entity.Bookentity;
import com.example.client.HelloApplication;
import com.example.client.response.BookListResponse;
import com.example.client.utils.HTTPUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ApplicationController {


    public static ObservableList<Bookentity> booksData = FXCollections.observableArrayList();
    HTTPUtils http = new HTTPUtils();


        @FXML
        public TableView<Bookentity> tableBooks;
        @FXML

        private TableColumn <Bookentity, String > bookName;
    @FXML
        private TableColumn <Bookentity, Long > bookId;
        @FXML
        private TableColumn<Bookentity, String> bookAuthor;
        @FXML
        private TableColumn <Bookentity, String > bookPublisher;
        @FXML
        private TableColumn <Bookentity, String > bookYear;
        @FXML
        private TableColumn <Bookentity, String > bookChapter;
//        @FXML

        /*    private void initialize() throws Exception {
                BookListResponse book = http.get("http://localhost:2825/api/v1/","all");
                for (int i = 0; i < book.data.size(); i++) booksData.add(book.data.get(i));
                bookId.setCellValueFactory(new PropertyValueFactory<Bookentity,Long>("id"));
                bookName.setCellValueFactory(new PropertyValueFactory<Bookentity, String>("title"));
                bookAuthor.setCellValueFactory(new PropertyValueFactory<Bookentity, String>("author"));
                bookPublisher.setCellValueFactory(new PropertyValueFactory<Bookentity, String>("publishing"));
                bookYear.setCellValueFactory(new PropertyValueFactory<Bookentity, String>("year"));
                bookChapter.setCellValueFactory(new PropertyValueFactory<Bookentity, String>("kind"));
                tableBooks.setItems(booksData);
            }*/
                @FXML
                void addBook (ActionEvent event) throws IOException
                {
                    HelloApplication.showPersonEditDialog();
                }
    }





