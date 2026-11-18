package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharFreq {

    public static void charFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            System.out.println(c + ":" + map.get(c));
        }
    }

    public static void main(String[] args) {
        String s = "aabccd";
        charFrequency(s);
    }
}
