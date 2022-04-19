package com.company;

public class MergeSort {
    //Recursive algorithm for merge sorts
    public void sort(int start, int end, int[] array ){
        int mid = (start+end)/2;
        if (start<end){
            //Sort left half
            sort(start,mid, array);

            //Sort right half
            sort(mid+1, end, array);

            merge(start, mid, end, array);
        }


    }
    void merge(int start, int mid, int end, int[] array){
        //initialize temporary array and index
        int[] tmpArray=new int[array.length];
        int tmpArrayIndex=start;

        int startIndex=start;
        int midIndex=mid+1;

        //Iterate until smaller list reaches to the end
        while (startIndex <= mid && midIndex <= end){
            if (array[startIndex]<array[midIndex]) {
                tmpArray[tmpArrayIndex++] = array[startIndex++];
            }else{
                tmpArray[tmpArrayIndex++]=array[midIndex++];

            }
        }
        //copy remaining elements
        while(startIndex <= mid){
            tmpArray[tmpArrayIndex++] =array[startIndex++];
        }
        while (midIndex <= end){
            tmpArray[tmpArrayIndex++]=array[midIndex++];

        }

        //Copy tmpArray to actual array after sorting
        if (end+1-start >=0){
            System.arraycopy(tmpArray, start, array, start, end+1-start);
        }
    }
}
