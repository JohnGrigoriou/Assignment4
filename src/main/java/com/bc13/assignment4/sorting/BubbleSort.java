package com.bc13.assignment4.sorting;

import com.bc13.assignment4.models.TShirt;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<TShirt> tshirts, Comparator<TShirt> comparator, boolean isASC) {
        for (int i = 0; i < tshirts.size(); i++) {
            for (int j = 1; j < (tshirts.size() - i); j++) {
                if (isASC) {
                    if (comparator.compare(tshirts.get(j-1), tshirts.get(j))<0) {   
                        swapTShirtArrayList(tshirts, j, j - 1);
                    }
                } else {
                    if (comparator.compare(tshirts.get(j-1), tshirts.get(j))>0) {                          
                        swapTShirtArrayList(tshirts, j, j - 1);
                    }
                }
            }
        }
    }
    
    public static void swapTShirtArrayList(List<TShirt> tshirts, int x , int y) {
        TShirt buffer = tshirts.get(y);
        tshirts.set(y,tshirts.get(x));
        tshirts.set(x,buffer);
    }

}
