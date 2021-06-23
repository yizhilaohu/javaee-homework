package com.example.BeerE;


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

            public List getBeer(String color){

                List<Beer> beer= new ArrayList<>();
                if (color.equals("amber")) {
                    beer.add(new Beer("Jack Amber",10,5,"JACK",2000));
                    beer.add(new Beer("Red Moose",10,5,"RED",2000));

                } else {
                    beer.add(new Beer("Jali Pale Ale",10,5,"JALI",2000));
                    beer.add(new Beer("Gout Stout",10,5,"GOUT",2000));
                }
                return (beer);

            }

    }
