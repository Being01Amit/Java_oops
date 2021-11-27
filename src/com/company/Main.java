package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr= {1,2,1,2,1,3,4,5,6,7,1,2};
        removeDuplicate(arr);
    }
/* Function for the remove the duplicate numbers or element from the arrays. */
    public static void removeDuplicate(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0 ; i < arr.length -1 ; i++){
            set.add(arr[i]);
        }
        System.out.print(set+" ");
    }
}


