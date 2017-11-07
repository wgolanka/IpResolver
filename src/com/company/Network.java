package com.company;


public class Network extends Address {


    Network() {
    }

    Network(String nAddress) {
        this.address = nAddress;
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    @Override
    void setAddress(String address) {
        super.setAddress(address);
    }

    String getAddressFromIpv4AndSubNet(IpV4 ipV4, SubNetMask subNetMask) {
        String[] ipAddress = ipV4.address.split("\\.");
        String[] subNetAddress = subNetMask.address.split("\\.");

        StringBuilder nAddress = new StringBuilder();
        for (int i = 0; i < ipAddress.length && i < subNetAddress.length; i++) {

            nAddress.append(String.valueOf(
                    Integer.valueOf(ipAddress[i]) & Integer.valueOf(subNetAddress[i])));

            nAddress.append(".");
        }
        nAddress.deleteCharAt(nAddress.length() - 1);

        return nAddress.toString();
    }
}
