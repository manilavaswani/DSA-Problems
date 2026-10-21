package Hashmap;

import java.util.HashMap;

public class majorityElement {

    public static void majorityElement(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 1, 2, 4, 3, 5, 1 };
        majorityElement(arr);
    }
}
