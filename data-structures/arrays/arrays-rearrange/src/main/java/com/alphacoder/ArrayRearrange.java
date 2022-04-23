package com.alphacoder;

public class ArrayRearrange {

    public void reArrangeArray(int [] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(arr[j]==i){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    break;
                }
            }
        }
    }

    public void reArrangeArray2(int [] arr){
        for(int i=0; i< arr.length;){
            if(arr[i]>=0 && arr[i]!= i){
                int temp= arr[arr[i]];  //temp= 2
                arr[arr[i]]= arr[i];  // arr[6]= arr[i]
                arr[i]= temp;  //arr[2]= 2
            }else{
                i++;
            }
        }
    }
}
