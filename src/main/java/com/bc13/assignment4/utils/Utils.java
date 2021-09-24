package com.bc13.assignment4.utils;

import com.bc13.assignment4.models.TShirt;
import java.util.List;

public class Utils {

    private static long startTime;
    private static long endTime;
    
    public static double roundTo2DecimalPoints(double value) {
        long tmp = Math.round(value * 100);
        return (double) tmp / 100;
    }
    
    public static void showTShirts(List<TShirt> tShirts) {
        Style.println(Style.PURPLE, "ID____COLOR____SIZE____FABRIC____PRICE");
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
    
    public static void printTShirts(List<TShirt> tShirts) {
        startTime = System.currentTimeMillis();
        showTShirts(tShirts);
        endTime = System.currentTimeMillis();
        Style.println(Style.GREEN,"-----Execution Time:"+(endTime-startTime)+" milliseconds-----\n\n");
    }

}
