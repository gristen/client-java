package com.example.client.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;




@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Bookentity {
    private Long id;
    private String title;
    private String author;
    private String publishing;
    private int year;
    private String kind;
}
