package edu.pzks;

import n.RomanToInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    void testBasicSymbols() {
        // 1-7: Перевірка одиночних символів
        assertEquals(1, RomanToInteger.romanToInt("I"));
        assertEquals(5, RomanToInteger.romanToInt("V"));
        assertEquals(10, RomanToInteger.romanToInt("X"));
        assertEquals(50, RomanToInteger.romanToInt("L"));
        assertEquals(100, RomanToInteger.romanToInt("C"));
        assertEquals(500, RomanToInteger.romanToInt("D"));
        assertEquals(1000, RomanToInteger.romanToInt("M"));
    }

    @Test
    void testAddition() {
        // 8-12: Випадки, де цифри тільки додаються
        assertEquals(2, RomanToInteger.romanToInt("II"));
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(15, RomanToInteger.romanToInt("XV"));
        assertEquals(20, RomanToInteger.romanToInt("XX"));
        assertEquals(2026, RomanToInteger.romanToInt("MMXXVI"));
    }

    @Test
    void testSubtractionRules() {
        // 13-18: Шість випадків віднімання, згаданих у вашому тексті
        assertEquals(4, RomanToInteger.romanToInt("IV"));
        assertEquals(9, RomanToInteger.romanToInt("IX"));
        assertEquals(40, RomanToInteger.romanToInt("XL"));
        assertEquals(90, RomanToInteger.romanToInt("XC"));
        assertEquals(400, RomanToInteger.romanToInt("CD"));
        assertEquals(900, RomanToInteger.romanToInt("CM"));
    }

    @Test
    void testComplexNumbers() {
        // 19-25: Складні комбінації
        assertEquals(27, RomanToInteger.romanToInt("XXVII")); // З вашого прикладу
        assertEquals(12, RomanToInteger.romanToInt("XII"));   // З вашого прикладу
        assertEquals(58, RomanToInteger.romanToInt("LVIII"));
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
        assertEquals(3999, RomanToInteger.romanToInt("MMMCMXCIX"));
        assertEquals(49, RomanToInteger.romanToInt("XLIX"));
        assertEquals(88, RomanToInteger.romanToInt("LXXXVIII"));
    }
}
