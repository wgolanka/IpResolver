package com.company;

public class ObligatoryData
{

    String ipV4Address;
    String subnetMask;

    public ObligatoryData(){}

    public ObligatoryData(String ipV4Address, String subnetMask)
    {
        this.ipV4Address = ipV4Address;
        this.subnetMask = subnetMask;
    }

    public String getIpV4Address()
    {
        return ipV4Address;
    }

    public String getSubnetMask()
    {
        return subnetMask;
    }

    public void setIpV4Address(String ipV4Address)
    {
        this.ipV4Address = ipV4Address;
    }

    public void setSubnetMask(String subnetMask)
    {
        this.subnetMask = subnetMask;
    }

    public int[] toBinaryArray(String address){

        // TODO convert pieces between dots instead of whole number.
        String addressWithoutDots = address.replaceAll("\\.", "");
        System.out.println("address without dots " + addressWithoutDots);

        String number = Long.toBinaryString(Long.valueOf(addressWithoutDots));
//        String number = Integer.toBinaryString(Integer.valueOf(addressWithoutDots));
        System.out.println("\n----");
        System.out.println(number);
        System.out.println("----");

        int[] binary = new int[number.length()];

        for(int k = 0; k < binary.length - 1; k++){
            binary[k] = Integer.valueOf(number.substring(k, k+1));
            System.out.print(binary[k]);
            if(k % 4 == 0){
                System.out.print("  ");
            }
        }
        System.out.println("\n----------------");

        return binary;
    }
}
