package com.company;

import Place.Route;

public class ColossalCave {

    public static void main(String[] args) {
        while (true) {
            System.out.println("You just appear at the end of the road in front of a small brick building. A small brook flows next to the building at the bottom of a gutter..");
            System.out.println("You can move by using the keyword \"move\" and by using a cardinal point ex: move west");
            System.out.println("Write \"quit\" to leave the game");
            Route route = new Route();
            route.Move();
        }
    }
}
