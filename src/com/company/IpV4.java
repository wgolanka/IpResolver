package com.company;

public class IpV4 extends Address
{

    public IpV4(){}

    public IpV4(String ipV4Address)
    {
//        this.ipV4 = ipV4Address;
        this.address = ipV4Address;
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    public void setIpV4(String ipV4) {
        this.address= ipV4;
    }
}
