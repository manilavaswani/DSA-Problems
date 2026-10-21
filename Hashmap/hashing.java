package Hashmap;

import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        HashMap<String, Integer> data = new HashMap<>();

        // Put the value inside HashMap
        data.put("Petrol", 100);
        data.put("Diesel", 80);
        data.put("CNG", 60);
        System.out.println(data);

        // Update the value inside HashMap
        data.put("Petrol", 120);
        System.out.println(data);

        System.out.println("Size of HashMap: " + data.size());

        // Checking the value is present or not
        if (data.containsKey("Vasline")) {
            System.out.println("Vasline is present");
        } else {
            System.out.println("Vasline is not present");
        }

        // Get the value from HashMap
        System.out.println(data.get("Diesel"));
        System.out.println(data.get("Vasline"));

        // Iterating the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        // Iterating the Array using for-each loop
        for (int value : arr) {
            System.out.print(value + ",");
        }
        System.out.println();

        data.remove("CNG");
        System.out.println(data);

    }
}
