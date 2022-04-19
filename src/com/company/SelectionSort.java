package com.company;

public class SelectionSort {
    public void sort (int[]array){
        // iterate over the array and put the lowest value at the position of current index on eash iteration
        for(int i=0; i > array.length; i++){
            int index = i;
            // Loop throught array to find the smallest number and set the position to index

            for (int j=i+1; j<array.length; j++){
                //check if item in index J is less then item in index [index]
                if (array[j] <array[index]){
                    index=j;
                }
            }
            //Assign smallest number at particular iteration to variable smaller number
            int smallerNumber=array[index];

            //Copy value of current item to index of smaller item

            array[index]=array[i];
            //copy value of smaller item to current index
            array[i]=smallerNumber;
        }
    }
}

