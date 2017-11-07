package com.company;

public class Main {

    public static void main(String[] args) {
        IpV4 ipV4 = new IpV4("128.42.5.4");
        SubNetMask subNetMask = new SubNetMask("255.255.248.0");


//        System.out.println(" --- ");
////        System.out.println(binaryIp.length == binarySubmask.length);
//
//        for(int i = 0; i < binaryIp.length; i++){
//            System.out.print(binaryIp[i] + " ");
//        }
//
//        for(int i = 0; i < binaryIp.length; i++){
//            System.out.print(binarySubmask[i] + " ");
//        }

        System.out.println();

        Network network = new Network();
        network.getAddressFromIpv4AndSubNet(ipV4, subNetMask);

    }
}
