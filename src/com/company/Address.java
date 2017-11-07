package com.company;

public class Address {

    String address;

    String getAddress() {
        return this.address;
    }

    void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return this.address;
    }
}
