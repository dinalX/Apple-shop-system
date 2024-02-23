/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinal.appleistore3.product;

import dinal.appleistore3.CSVHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author dnlx
 */
public class Product {
    private String id;
    private String productID;
    private String name;
    private String category;
    private int quantity;
    private int price;

    public Product (String productID,String name, String category, int quantity,int price) {
        UUID randomUUID = UUID.randomUUID();
        this.id = randomUUID.toString();
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Product (String id,String productID, String name, String category, int quantity, int price) {
        this.id = id;
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    @Override
    public String toString() {
        return this.id + "," + this.productID + ","+ this.name + "," + this.category + "," + this.quantity + "," + this.price;
    }
    
    public boolean save() throws IOException {
        String content = this.toString();
        CSVHandler.write("./product.csv", content, true);
        return true;
    }
    
    public boolean update() throws FileNotFoundException, IOException {
        ArrayList<String> products = CSVHandler.read("./product.csv");
        for (int index = 0; index < products.size(); index++) {
            String product = products.get(index);
            String[] data = product.split(",");
            if (data[0].equals(this.id)) {
                data[1] = this.productID;
                data[2] = this.name;
                data[3] = this.category;
                data[4] = Integer.toString(this.quantity);
                data[5] = Integer.toString(this.price);
                products.set(index, String.join(",", data));
            }
        }
        CSVHandler.write("./product.csv", products, false);
        return true;
    }
    
    public boolean delete() throws FileNotFoundException, IOException {
        // delete file logic
        ArrayList<String> products = CSVHandler.read("./product.csv");
        for (int index = 0; index < products.size(); index++) {
            String product = products.get(index);
            String[] data = product.split(",");
            if (data[0].equals(this.id)) {
                products.remove(index);
            }
        }
        CSVHandler.write("./product.csv", products, false);
        return true;
    }
    
}
