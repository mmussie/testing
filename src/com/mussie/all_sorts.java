package com.mussie;
/*** This is a bubble sort routine.  It takes array as an input and returns
 * in sorted order.
 *   */

public class all_sorts{


    public String[] bubble_sort(String[] arry) {
        String temp;
        boolean swap;
        final int len = arry.length;
        for (int i = 0 ; i < len; i++){
            swap = false;
            for (int j = 0; j < len - 1;  j++) {
                // System.out.println(arry[j]+arry[j+1]);
                if ( arry[j].compareToIgnoreCase( arry[j+1] ) > 0 ) {
                    // if ( Integer.valueOf(arry[j]) > Integer.valueOf(arry[j+1])) {
                    temp = arry[j];
                    arry[j]= arry[j+1];
                    arry[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return arry;
    }
}