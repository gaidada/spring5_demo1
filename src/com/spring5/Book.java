package com.spring5;

public class Book {
    private String bName;
    private String address;

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book() {
    }

    public Book(String bName) {
        this.bName = bName;
    }

    public void test() {
        System.out.println(bName + ":" + address);
    }

}
