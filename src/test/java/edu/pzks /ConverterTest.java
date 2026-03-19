package edu.pzks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   lab_3_4_test
  @class  ConverterTest
  @version  1.0.0 
  @since 10.03.25 - 14.05
*/

public class ConverterTest {

    @BeforeEach
    void setUp() {
        Converter converter = new Converter();
        Assertions.assertNotNull(converter);

    }

    @Test
    void arabicToRoman_shouldConvert1() {
        assertEquals("I", Converter.arabicToRoman(1));
    }

    @Test
    void arabicToRoman_shouldConvert58() {
        assertEquals("LVIII", Converter.arabicToRoman(58));
    }

    @Test
    void arabicToRoman_shouldConvert1994() {
        assertEquals("MCMXCIV", Converter.arabicToRoman(1994));
    }

    @Test
    void arabicToRoman_shouldThrowExceptionForZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.arabicToRoman(0);
        });
    }

    @Test
    void arabicToRoman_shouldThrowExceptionForNumberGreaterThan4000() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.arabicToRoman(4001);
        });
    }

    @Test
    void romanToArabic_shouldConvertI() {
        assertEquals(1, Converter.romanToArabic("I"));
    }

    @Test
    void romanToArabic_shouldConvertX() {
        assertEquals(10, Converter.romanToArabic("X"));
    }

    @Test
    void romanToArabic_shouldConvertMCMXCIV() {
        assertEquals(1994, Converter.romanToArabic("MCMXCIV"));
    }

    @Test
    void romanToArabic_shouldThrowExceptionForInvalidSymbol() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("ABC");
        });
    }

    @Test
    void romanToArabic_shouldThrowExceptionForIncorrectRomanNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("IIIIIIII");
        });
    }

    @Test
    void romanToArabic_shouldThrowExceptionForCyrillicLetters() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Converter.romanToArabic("ІХ")
        );

        assertTrue(exception.getMessage().contains("incorrect symbol"));
    }

    @Test
    void romanToArabic_shouldThrowExceptionForInvalidSubtractiveForm() {
        assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic("IL"));
    }

    @Test
    void romanToArabic_shouldThrowExceptionForRepeatingV() {
        assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic("VV"));
    }
}

