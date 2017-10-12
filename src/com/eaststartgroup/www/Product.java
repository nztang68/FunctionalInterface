package com.eaststartgroup.www;

import java.text.DecimalFormat;

class Product {
    private int id;
    public String name, categories;
    private float price;

    Product(int id, String name, String categories, float price) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    @Override
    public String toString() {
        return (this.name + (new DecimalFormat(" $0.00")).format(this.price));
    }
}
