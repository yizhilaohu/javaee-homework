package com.example.BeerE;

public class Beer {
    private String brand;
    private int year_of_birth;
    private double size;

    public Beer(String brand, int year, double size) {
        this.brand = brand;
        this.year_of_birth =  year;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }
    public void setYear_of_birth(int year){

        this.year_of_birth =  year;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "brand='" + brand + '\'' +
               ",year='"+year_of_birth
               + ", size=" + size +
                '}';
    }
}
