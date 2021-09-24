package com.bc13.assignment4.sorting;

import com.bc13.assignment4.models.Color;
import com.bc13.assignment4.models.Fabric;
import com.bc13.assignment4.models.Size;
import com.bc13.assignment4.models.TShirt;
import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    public static void bucketSortSize(List<TShirt> list, boolean isAsc) {        
        List<List> buckets = new ArrayList<>();
        for (int i = 0; i < Size.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());            
        }
        for (int i = 0; i < list.size(); i++) {
            int bucketNo = list.get(i).getSize().ordinal();
            buckets.get(bucketNo).add(list.get(i));
        }                
        if(isAsc){
            list.clear();
            for (int i = 0; i < buckets.size(); i++) {
                list.addAll(buckets.get(i));
            }
        }
        else{
            list.clear();
            for (int i = (buckets.size()-1); i >= 0; i--) {
                list.addAll(buckets.get(i));
            }
        }
    }
    
    
    public static void bucketSortColor(List<TShirt> list, boolean isAsc) {        
        List<List> buckets = new ArrayList<>();
        for (int i = 0; i < Color.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());            
        }
        for (int i = 0; i < list.size(); i++) {
            int bucketNo = list.get(i).getColor().ordinal();
            buckets.get(bucketNo).add(list.get(i));
        }
        if(isAsc){
            list.clear();
            for (int i = 0; i < buckets.size(); i++) {
                list.addAll(buckets.get(i));
            }
        }
        else{
            list.clear();
            for (int i = (buckets.size()-1); i >= 0; i--) {
                list.addAll(buckets.get(i));
            }
        }
    }
    
    
    public static void bucketSortFabric(List<TShirt> list, boolean isAsc) {        
        List<List> buckets = new ArrayList<>();           
        for (int i = 0; i < Fabric.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());            
        }
        for (int i = 0; i < list.size(); i++) {
            int bucketNo = list.get(i).getFabric().ordinal();
            buckets.get(bucketNo).add(list.get(i));
        }                
        if(isAsc){
            list.clear();
            for (int i = 0; i < buckets.size(); i++) {
                list.addAll(buckets.get(i));
            }
        }
        else{
            list.clear();
            for (int i = (buckets.size()-1); i >= 0; i--) {
                list.addAll(buckets.get(i));
            }
        }
    }
    
    
    public static void bucketSortChain(List<TShirt> list, boolean isAsc) {           
        BucketSort.bucketSortFabric(list,isAsc);
        BucketSort.bucketSortColor(list,isAsc);
        BucketSort.bucketSortSize(list, isAsc);            
    }
    
}
