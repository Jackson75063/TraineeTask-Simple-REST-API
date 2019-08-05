package com.jackson.model;

public enum Color {
    GREEN,
    RED,
    BLUE,
    BLACK,
    WHITE,
    YELLOW;


    public static boolean isExist(String checedColor){

        for(Color c : Color.values())
            if(c.name().equals(checedColor.toUpperCase()))
                return true;


        return false;
    }
}
