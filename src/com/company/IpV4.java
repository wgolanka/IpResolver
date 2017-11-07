package com.company;

public class IpV4 extends Address {

    public IpV4() {
    }

    public IpV4(String ipV4Address) {
        this.address = ipV4Address;
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    @Override
    void setAddress(String address) {
        super.setAddress(address);
    }
}
