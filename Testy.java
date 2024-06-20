//Przykładowa Klasa do testowania_______________________________________________________________________________________________

package com.example.utils;

/**
 * Klasa zawierająca proste metody matematyczne.
 */
public class MathUtils {

    /**
     * Metoda dodająca dwie liczby całkowite.
     * @param a Pierwsza liczba całkowita
     * @param b Druga liczba całkowita
     * @return Suma dwóch liczb całkowitych
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Metoda sprawdzająca, czy liczba jest parzysta.
     * @param number Liczba do sprawdzenia
     * @return true, jeśli liczba jest parzysta; false w przeciwnym razie
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


// przykłady testów jednostkowych_____________________________________________________________________________________________________


package com.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testy jednostkowe dla klasy MathUtils.
 */
public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(3, 7);
        Assertions.assertEquals(10, result, "Dodawanie powinno zwrócić poprawny wynik");
    }

    @Test
    public void testIsEven() {
        MathUtils mathUtils = new MathUtils();
        Assertions.assertTrue(mathUtils.isEven(2), "Liczba 2 powinna być parzysta");
        Assertions.assertFalse(mathUtils.isEven(3), "Liczba 3 nie powinna być parzysta");
    }
}
