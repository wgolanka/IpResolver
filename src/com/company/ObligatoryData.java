package com.company;

public class ObligatoryData {

    String ipV4Address;
    String subnetMask;

    public ObligatoryData(){}

    public ObligatoryData(String ipV4Address, String subnetMask){
        this.ipV4Address = ipV4Address;
        this.subnetMask = subnetMask;
    }

    public String getIpV4Address() {
        return ipV4Address;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setIpV4Address(String ipV4Address) {
        this.ipV4Address = ipV4Address;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }
}
