package com.corejava;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Bubble 
{
    public static void main( String[] args )
    {
        int[] arr={10,23,12,35,19};
        int key=12;
        int res=Arrays.binarySearch(arr, key);
        if(res>=0) {
        	System.out.println(key  +  " find index at " +  res);
        }
    }
}
