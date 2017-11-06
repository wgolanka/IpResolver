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
            System.out.print(binary[k]);
            if(k % 4 == 0){
                System.out.print("  ");
            }
        }
        return binary;
    }

    long[] toDigitsArray(long[] binaryNumbers){
        return null;

    }

}
