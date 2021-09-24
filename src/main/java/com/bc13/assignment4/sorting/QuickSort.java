package com.bc13.assignment4.sorting;

import com.bc13.assignment4.models.TShirt;
import java.util.Comparator;
import java.util.List;

public class QuickSort {

    public static void quickSort(List<TShirt> tshirts, Comparator<TShirt> comparator, boolean isASC) {
        quickSort(tshirts, 0, 39, comparator, isASC);
    }
    
    public static void quickSort(List<TShirt> tshirts, int low, int high, Comparator<TShirt> comparator, boolean isASC){ 
         if (low < high) {
            int pi;
            if (isASC) {
                pi = partition(tshirts, low, high, comparator, true);
                quickSort(tshirts, low, pi - 1, comparator, true);
                quickSort(tshirts, pi + 1, high, comparator, true);
            } else {
                pi = partition(tshirts, low, high, comparator, false);
                quickSort(tshirts, low, pi - 1, comparator, false);
                quickSort(tshirts, pi + 1, high, comparator, false);
            }
        }
    }
    
    public static void swapTShirtArrayList(List<TShirt> tshirts, int x , int y) {
        TShirt buffer = tshirts.get(x);
        tshirts.set(x,tshirts.get(y));
        tshirts.set(y,buffer);
    }
 
   public static int partition(List<TShirt> tshirts, int low, int high, Comparator<TShirt> comparator, boolean isASC) {
        TShirt pivot = tshirts.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (isASC) {
                if (comparator.compare(tshirts.get(j), pivot) > 0) {
                    i++;
                    swapTShirtArrayList(tshirts, i, j);
                }                
            } else {
                if (comparator.compare(tshirts.get(j), pivot) < 0) {
                    i++;
                    swapTShirtArrayList(tshirts, i, j);
                }
            }
        }
        swapTShirtArrayList(tshirts, i + 1, high);
        return (i + 1);
    }
    
}
