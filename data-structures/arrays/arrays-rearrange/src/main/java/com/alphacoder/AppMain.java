package com.alphacoder;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        int arr[]= {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        ArrayRearrange arrayRearrange= new ArrayRearrange();
        arrayRearrange.reArrangeArray(arr);
        //arrayRearrange.reArrangeArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
