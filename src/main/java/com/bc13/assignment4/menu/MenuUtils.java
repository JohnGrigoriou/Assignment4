package com.bc13.assignment4.menu;

import com.bc13.assignment4.comparators.TShirtChainedComparator;
import com.bc13.assignment4.comparators.TShirtColorComparator;
import com.bc13.assignment4.comparators.TShirtFabricComparator;
import com.bc13.assignment4.comparators.TShirtSizeComparator;
import com.bc13.assignment4.models.TShirt;
import com.bc13.assignment4.sorting.BubbleSort;
import com.bc13.assignment4.sorting.BucketSort;
import com.bc13.assignment4.sorting.QuickSort;
import com.bc13.assignment4.utils.Style;
import com.bc13.assignment4.utils.Utils;
import java.util.List;

public class MenuUtils {

    public static void menuOptions() {
        Style.print(Style.YELLOW, "M E N U");
        Style.print(Style.YELLOW,"\n1) ");System.out.println("SORT T-SHIRTS IN SIZE ASC");
        Style.print(Style.YELLOW,"2) ");System.out.println("SORT T-SHIRTS IN SIZE DESC");
        Style.print(Style.YELLOW,"3) ");System.out.println("SORT T-SHIRTS IN COLOR ASC");
        Style.print(Style.YELLOW,"4) ");System.out.println("SORT T-SHIRTS IN COLOR DESC");
        Style.print(Style.YELLOW,"5) ");System.out.println("SORT T-SHIRTS IN FABRIC ASC");
        Style.print(Style.YELLOW,"6) ");System.out.println("SORT T-SHIRTS IN FABRIC DESC");
        Style.print(Style.YELLOW,"7) ");System.out.println("SORT T-SHIRTS IN SIZE, COLOR, FABRIC ASC");
        Style.print(Style.YELLOW,"8) ");System.out.println("SORT T-SHIRTS IN SIZE, COLOR, FABRIC DESC\n");
        System.out.print("TO DISPLAY MENU TYPE ");Style.println(Style.YELLOW, "\"MENU\"");
        Style.println(Style.RED,"TO LEAVE APP TYPE \"EXIT\"");
        Style.line();
    }
    
    public static void exit() {
        Style.println(Style.PURPLE,"\n\n\n_____________________THANK YOU FOR USING OUR E-SHOP_____________________");
        System.exit(0);
    }
    
    public static void sortBySizeAsc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT ASC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtSizeComparator(), true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT ASC-------------");
        BucketSort.bucketSortSize(allTShirts, true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT ASC-------------");
        QuickSort.quickSort(allTShirts, new TShirtSizeComparator(), true);
        Utils.printTShirts(allTShirts);
        Style.line();  
    }
    
    public static void sortBySizeDesc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT DESC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtSizeComparator(), false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT DESC-------------");
        BucketSort.bucketSortSize(allTShirts, false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT DESC-------------");
        QuickSort.quickSort(allTShirts, new TShirtSizeComparator(), false);
        Utils.printTShirts(allTShirts);
        Style.line();  
    }
    
    public static void sortByColorAsc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT ASC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtColorComparator(), true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT ASC-------------");
        BucketSort.bucketSortColor(allTShirts, true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT ASC-------------");
        QuickSort.quickSort(allTShirts, new TShirtColorComparator(), true);
        Utils.printTShirts(allTShirts);
        Style.line();  
    }
    
    public static void sortByColorDesc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT DESC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtColorComparator(), false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT DESC-------------");
        BucketSort.bucketSortColor(allTShirts, false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT DESC-------------");
        QuickSort.quickSort(allTShirts, new TShirtColorComparator(), false);
        Utils.printTShirts(allTShirts);
        Style.line();   
    }
    
    public static void sortByFabricAsc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT ASC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtFabricComparator(), true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT ASC-------------");
        BucketSort.bucketSortFabric(allTShirts, true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT ASC-------------");
        QuickSort.quickSort(allTShirts, new TShirtFabricComparator(), true);
        Utils.printTShirts(allTShirts);
        Style.line();  
    }
    
    public static void sortByFabricDesc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT DESC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtFabricComparator(), false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT DESC-------------");
        BucketSort.bucketSortFabric(allTShirts, false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT DESC-------------");
        QuickSort.quickSort(allTShirts, new TShirtFabricComparator(), false);
        Utils.printTShirts(allTShirts);
        Style.line();   
    }
    
    public static void sortBySizeColorFabricAsc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT ASC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtChainedComparator(new TShirtSizeComparator(), new TShirtColorComparator(), new TShirtFabricComparator()), true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT ASC-------------");
        BucketSort.bucketSortChain(allTShirts, true);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT ASC-------------");
        QuickSort.quickSort(allTShirts, new TShirtChainedComparator(new TShirtSizeComparator(), new TShirtColorComparator(), new TShirtFabricComparator()), true);
        Utils.printTShirts(allTShirts);
        Style.line();  
    }
    
    public static void sortBySizeColorFabricDesc(List<TShirt> allTShirts) {
        System.out.println("-------------BUBBLE SORT DESC-------------");
        BubbleSort.bubbleSort(allTShirts, new TShirtChainedComparator(new TShirtSizeComparator(), new TShirtColorComparator(), new TShirtFabricComparator()), false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------BUCKET SORT DESC-------------");
        BucketSort.bucketSortChain(allTShirts, false);
        Utils.printTShirts(allTShirts);
        System.out.println("-------------QUICK SORT DESC-------------");
        QuickSort.quickSort(allTShirts, new TShirtChainedComparator(new TShirtSizeComparator(), new TShirtColorComparator(), new TShirtFabricComparator()), false);
        Utils.printTShirts(allTShirts);
        Style.line();   
    }
  
}
