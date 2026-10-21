package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class intersectionofArray {
    
    public static void IntersectionArray(int arr1[], int arr2[]) {

        int count = 0;
        HashSet<Integer> map = new HashSet<>();

        for (int val : arr1) {
           map.add(val);
        }
        for (int val : arr2) {
            if (map.contains(val)) {
                System.out.print(val + " ");
                count += 1;
                map.remove(val);
            }
        }
     
    }

    public static void main(String[] args) {
        int arr1[] = { 5,5,3 };
        int arr2[] = { 3,2 };

        IntersectionArray(arr1, arr2);
    }
}