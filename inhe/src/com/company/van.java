package com.company;

public class van extends Vehical {

    int nubofdoors;
    int loadcapacity;

    public void loadvan(){
        System.out.println("loading van...");
    }

    public void showvandata(){

        vName = "toyotaVAN";
        color = "green";
        seats = 10;
        numbofwheels = 4;

        nubofdoors = 8 ;
        loadcapacity = 12;

        System.out.println("v : " + vName);
        System.out.println("v : " + loadcapacity);

    }
}
