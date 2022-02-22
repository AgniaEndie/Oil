package com.endienasg.oil.vendor;

import java.util.ArrayList;
import java.util.List;

public class Resources {
    public String name;
    public int resistance_level;
    public double furnale_temp;
    public int dollar;
    public double healthpoint;
    public double weight;
    public static List<Resources> resourcesList;

    public List<Integer> list;
    public static int number1 = 1;
    public static int number2 = 2;
    public static int number3 = 3;



    public static Resources Coal = new Resources("Coal",2,2300,12,2,1200);
    public static Resources Iron = new Resources("Iron",12,1538,60,120,900);
    public static Resources Aluminium = new Resources("Aluminium",4,660.3,120,50,200);

    /*
    public static List Number(){
        List list = new ArrayList();
        list.add(number1);
        list.add(number2);
        list.add(number3);
        return list;
    }*/

    public Resources(String name,int resistance_level,double furnale_temp,int dollar, double healthpoint, double weight){
        this.name = name;
        this.resistance_level = resistance_level;
        this.furnale_temp = furnale_temp;
        this.dollar = dollar;
        this.healthpoint = healthpoint;
        this.weight = weight;



    }

    public static List<Resources> vai() {
        List<Resources> resourcesList = new ArrayList<>();


        resourcesList.add(Coal);
        resourcesList.add(Iron);
        resourcesList.add(Aluminium);
        /*
        System.out.println(resourcesList.get(0).name + " имя объекта");
        System.out.println(resourcesList.get(0).resistance_level + " прочность(сопротивление) объекта");
        System.out.println(resourcesList.get(0).furnale_temp + " Температура плавления объекта");
        System.out.println(resourcesList.get(0).dollar + " Цена объекта");
        System.out.println(resourcesList.get(0).healthpoint + " прочность(хп) объекта");
        System.out.println(resourcesList.get(0).weight + " вес объекта");*/
        return resourcesList;
    }
    /*int getNumber(int pos){
        return list.get(pos);
    }*/

    public static Resources getNumber(int index){
        return resourcesList.get(index);
    }

    //public void setName(String name){
        //this.name = name;
    //}
/*
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
    public String toString(){
        return name;
    }
*/
    /*Coal.setName("Coal");
        //Iron.setName("Iron");
        //Aluminium.setName("Aluminium");

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
        Aluminium.weight(200);*/
}
