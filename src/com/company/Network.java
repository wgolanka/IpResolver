package com.company;


public class Network extends Address{



     Network() {
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    @Override
    void setAddress(String address) {
        super.setAddress(address);
    }

    String getAddressFromIpv4AndSubNet(IpV4 ipV4, SubNetMask subNetMask){
        String[] ipAddress = ipV4.address.split("\\.");
        String[] subNetAdress = subNetMask.address.split("\\.");
        String[] networkAddress = new String[ipAddress.length];
        String network = "";
        for(int i = 0; i < ipAddress.length; i++){
            networkAddress[i] = String.valueOf(
                    Integer.valueOf(ipAddress[i]) & Integer.valueOf(subNetAdress[i]));
            System.out.print(networkAddress[i] + ".");
            network += networkAddress[i] + ".";
        }
        return network;
    }
}
