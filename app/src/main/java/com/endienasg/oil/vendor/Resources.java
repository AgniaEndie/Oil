package com.endienasg.oil.vendor;

import java.util.ArrayList;
import java.util.List;

public class Resources {
    private  String name;
    private int resistance_level;
    private double furnale_temp;



    private static Resources Coal;
    private static Resources Iron;
    private static Resources Aluminium;
    private int dollar;
    private double healthpoint;
    private double weight;

    public static List<Resources> vai() {
        List<Resources> resourcesList = new ArrayList<>();
        resourcesList.add(Coal);
        resourcesList.add(Iron);
        resourcesList.add(Aluminium);
        System.out.println(resourcesList);

        return resourcesList;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Coal.setName("Coal");
        Iron.setName("Iron");
        Aluminium.setName("Aluminium");

        Coal.resistance(2);
        Iron.resistance(12);
        Aluminium.resistance(4);

        Coal.furnale_temp(2300);
        Iron.furnale_temp(1538);
        Aluminium.furnale_temp(660.3);

        //SEll
        Coal.sell(12);
        Iron.sell(60);
        Aluminium.sell(120);
        //HP
        Coal.hp(2);
        Iron.hp(120);
        Aluminium.hp(50);
        //Weight
        Coal.weight(1200);
        Iron.weight(900);
        Aluminium.weight(200);


    }
    public void resistance(int resistance_level){
        this.resistance_level = resistance_level;
    }

    public void furnale_temp(double furnace_temp){
        this.furnale_temp = furnace_temp;
    }

    public void sell(int dollar){
        this.dollar = dollar;
    }
    public void hp(double healthpoint){
        this.healthpoint = healthpoint;
    }
    public void weight (double weight){
        this.weight = weight;
    }


}
