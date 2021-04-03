package com.spring5;

public class Order {
    private String oname;
    private String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void test() {
        System.out.println(this.oname + ":" + this.address);
    }
}
