package edu.pzks;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String input1 = "XXVII"; // 27
        String input2 = "MCMXCIV"; // 1994 (M=1000, CM=900, XC=90, IV=4)
        System.out.println(input1 + " = " + romanToInt(input1));
        System.out.println(input2 + " = " + romanToInt(input2));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentValue = romanValues.get(s.charAt(i));

            // віднімання: якщо поточне число менше за наступне
            if (i < n - 1 && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                // додавання: зліва направо від найбільшого до найменшого
                result += currentValue;
            }
        }

        return result;
    }
}
