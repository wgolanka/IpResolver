package com.company;

public class IpV4 extends Address
{
    String ipV4;

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


}
