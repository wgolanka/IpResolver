package com.company;

public class Address {


//    String network;
//    String broadcast;
//    String ipV4;
//    String subNetMask;

    String address;


    String getAddress(){
        return this.address;
    }

    void setAddress(String address){
        this.address = address;
    }

    long[] toBinaryArray(String address){

        // TODO convert pieces between dots instead of whole number.
        String[] onePiece = address.split("\\.");
        long[] binary = new long[onePiece.length];

        for(int k = 0; k < onePiece.length - 1; k++){
            binary[k] = Long.valueOf(Long.toBinaryString(Long.valueOf(onePiece[k])));
            System.out.print(binary[k] + " ");
            if(k % 4 == 0){
                System.out.print("  ");
            }
        }



//        String addressWithoutDots = address.replaceAll("\\.", "");
//        System.out.println("address without dots " + addressWithoutDots);
//
//        String number = Long.toBinaryString(Long.valueOf(addressWithoutDots));
////        String number = Integer.toBinaryString(Integer.valueOf(addressWithoutDots));
//        System.out.println("\n----");
//        System.out.println(number);
//        System.out.println("----");
//
//        int[] binary = new int[number.length()];
//
//        for(int k = 0; k < binary.length - 1; k++){
//            binary[k] = Integer.valueOf(number.substring(k, k+1));
//            System.out.print(binary[k]);
//            if(k % 4 == 0){
//                System.out.print("  ");
//            }
//        }
//        System.out.println("\n----------------");

        return binary;
    }

}
