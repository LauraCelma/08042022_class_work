package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Initialize the array of numbers we will be sorting through
        int[]numbers={4,3,6,2,1,5,9,4,6};

 //       InsertionSorts sorter=new InsertionSorts();
        BubbleSorts sorter =new BubbleSorts();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //working with clases
        //Class in java is a collection of methods
    }
}
