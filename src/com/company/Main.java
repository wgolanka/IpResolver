package com.company;

public class Main {

    public static void main(String[] args) {
        ObligatoryData obligatoryData = new ObligatoryData("128.42.5.4", "255.255.248.0");

        int[] binaryIp = obligatoryData.toBinaryArray(obligatoryData.ipV4Address);
        int[] binarySubmask = obligatoryData.toBinaryArray(obligatoryData.subnetMask);


//        System.out.println(binaryIp.length == binarySubmask.length);


    }
}
