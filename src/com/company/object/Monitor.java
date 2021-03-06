package com.company.object;


import java.sql.SQLException;
import java.util.ArrayList;

public class Monitor {
    private int id;
    private String name;
    private String firm;
    private int price;

    public Monitor(int id, String name, String firm, int price) {
        this.id = id;
        this.name = name;
        this.firm = firm;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
