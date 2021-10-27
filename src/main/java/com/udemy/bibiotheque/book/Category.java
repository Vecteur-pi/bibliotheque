package com.udemy.bibiotheque.book;

public class Category {
    public Category(String label) {
        this.label = label;
    }

    private  String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
