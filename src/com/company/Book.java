package com.company;

public class Book {
    private String id;
    private String Author;
    private String Title;
    private String Genre;
    private String Price;
    private String Description;
    private String Publish_Date;

    public Book(){

    }
    public Book(String id, String author, String title, String genre, String price, String description, String publish_Date) {
        this.id = id;
        Author = author;
        Title = title;
        Genre = genre;
        Price = price;
        Description = description;
        Publish_Date = publish_Date;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPublish_Date() {
        return Publish_Date;
    }

    public void setPublish_Date(String publish_Date) {
        Publish_Date = publish_Date;
    }


}
