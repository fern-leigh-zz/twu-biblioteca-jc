package com.twu.biblioteca;

import java.util.LinkedHashMap;

public class Book implements StockType {

    private LinkedHashMap<String, String> productInfo = new LinkedHashMap<>();

    private String reference;

    private String type = "book";

    public Book(String title, String author, String year, String reference) {

        this.reference = reference;

        productInfo.put("Reference", reference);
        productInfo.put("Title", title);
        productInfo.put("Author", author);
        productInfo.put("Year", year);
    }

    @Override
    public String getRef(){
        return reference;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public LinkedHashMap<String, String> getProductInfo() {
        return productInfo;
    }
}