package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Initialize the array of numbers we will be sorting through
        int[]numbers={4,7,3,6,2,1,5,9,4,6};

//create instance of insertion sort clas
//        InsertionSorts sorter=new InsertionSorts();
//        BubbleSorts sorter =new BubbleSorts();
//        SelectionSort sorter = new SelectionSort();
        MergeSort sorter = new MergeSort();
        //Sorting the array with the sorter.sort class
        sorter.sort(0,numbers.length-1, numbers);
        // Print sorted array to console
        System.out.println(Arrays.toString(numbers));
        //working with clases
        //Class in java is a collection of methods
    }
}







