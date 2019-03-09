package com.syns.duparray;


import com.sun.org.apache.bcel.internal.util.ByteSequence;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FindDuplicatesFromArray {

    public static void main(String args[])throws IOException {
/*  int[] inputArray = new int[8];
       inputArray[0]=1;
        inputArray[1]=2;
        inputArray[2]=4;
        inputArray[3]=2;
        inputArray[4]=5;
        inputArray[5]=8;
        inputArray[6]=8;
        inputArray[7]=8;

*/

        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
        System.out.println(Arrays.toString(origArray));

        Integer[] tempArray=removeDuplicatesWithOutCollections(origArray);
        System.out.println(Arrays.toString(tempArray));

        System.out.println("----------------------------------------");

    }

    private static Integer[] removeDuplicatesWithOutCollections(Integer[] arrays)

    {

        for (int i = 0; i < arrays.length-1; i++)
        {

                if(arrays[i]==(arrays[i+1]))
                {
                   arrays[i]=null;

                }

            }
        return arrays;
    }

}
