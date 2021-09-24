package com.bc13.assignment4.comparators;

import com.bc13.assignment4.models.TShirt;
import java.util.Comparator;

public class TShirtSizeComparator implements Comparator<TShirt> {

    @Override
    public int compare(TShirt o1, TShirt o2) {
        if (o1.getSize().ordinal() > o2.getSize().ordinal()) {
            return -1;
        } else if (o1.getSize().ordinal() < o2.getSize().ordinal()) {
            return 1;
        }
        return 0;
    }

}
