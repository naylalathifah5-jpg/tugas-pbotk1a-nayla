/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20042016;

/**
 *
 * @author Nayla latifah hasna
 */
public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty (int qty){
        this.qty = qty;
    }public String toSting(){
        return "'" + name + "' by" + author;
    }
}