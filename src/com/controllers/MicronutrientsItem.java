package com.controllers;

public class MicronutrientsItem implements Comparable<MicronutrientsItem>{
   
     private String name;
     private int quantity;

        public MicronutrientsItem(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public int compareTo(MicronutrientsItem othMicronutrientsItem) {

        return Integer.compare(this.quantity, othMicronutrientsItem.quantity);
    }


    @Override
    public String toString() {
        return "MicronutrientsItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }


  
}





