package com.company;

public class BubbleSorts {
public void sort(int[] array){
    //Iterate over the array and move the largest number to the far right of the array
    for (int i=0; i<array.length; i++){
        //Everey time the loop runs checks for the biggest  number by checking every 2 index and moving the highest value to the right till gets to the end
        for (int j=0; j< array.length-1-i;j++){
            //Swapping operation
            if (array[j]> array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];//the smaller value is copied into the index of the greater one
                array[j+1]=temp;//Assign the saved temp value to the index of the smaller item
            }
        }
    }
}
}
