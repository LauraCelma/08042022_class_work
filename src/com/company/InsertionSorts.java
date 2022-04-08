package com.company;

public class InsertionSorts {
    public void sort(int[]array){
        //Iterate over the array and insert each item in the right position
        //We start with i=1 because we cannot compere the first value to any other item
        for(int i=1; i< array.length; i++){
            int current =array [i];

            //Declare J to represent the number of sorted items in the list
            int j;
            for (j=i; j>0 && array [j-1]> current; j--);{
                array[j]=array[j-1]; //Move the higher value to the right
            }// After first interation
           array[j]= current;
        }
    }
}
