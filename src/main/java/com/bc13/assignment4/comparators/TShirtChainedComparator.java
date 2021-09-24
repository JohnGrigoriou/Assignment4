package com.bc13.assignment4.comparators;

import com.bc13.assignment4.models.TShirt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TShirtChainedComparator implements Comparator<TShirt>{

    List<Comparator<TShirt>> comparators;
    
    public TShirtChainedComparator(Comparator<TShirt>...comparator) {
        this.comparators = Arrays.asList(comparator);
    }
   
    @Override
    public int compare(TShirt o1, TShirt o2) {        
        for (Comparator<TShirt> comparator : comparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

}
