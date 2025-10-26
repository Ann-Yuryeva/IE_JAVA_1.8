package ru.netology;

public class Product {


    private int id;


    private String name;
    private String price;

    private Product[] items = new Product[0];

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void save(Product item) {
    }

    public void removeById(int id) {
    }

}
