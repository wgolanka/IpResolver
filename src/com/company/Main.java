package com.company;

public class Main {

    public static void main(String[] args) {
        IpV4 ipV4 = new IpV4("128.42.5.4");
        SubNetMask subNetMask = new SubNetMask("255.255.248.0");

        Network network = new Network();
        network.setAddress(network.getAddressFromIpv4AndSubNet(ipV4, subNetMask));
        System.out.print(network.toString());

    }
}
