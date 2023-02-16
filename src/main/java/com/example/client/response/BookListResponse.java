package com.example.client.response;

import com.example.client.Entity.Bookentity;
import com.example.client.utils.HTTPUtils;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.client.controller.ApplicationController.booksData;
@RequiredArgsConstructor

public class BookListResponse extends BaseResponse {
    HTTPUtils http = new HTTPUtils();
    public List<Bookentity>data;
    public BookListResponse(List<Bookentity> data)
    {
        super(true,"список книг");
        this.data = data;
    }

}
