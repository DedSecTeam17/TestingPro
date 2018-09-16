package com.company.NumbersOperations;

import com.company.UserValidationMethods.UserValidation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class TestCases {
    private static Numbers numbers;

    @BeforeClass
    public static void setUp() {
        numbers = new Numbers();
    }

    @Test
    public void TestBinary() {
        assertTrue(numbers.isBinary("10001001000101110"));
    }

    @Test
    public void TestDistinctArray() {
        assertTrue(numbers.isDistinct(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void TestEven() {
        assertTrue(numbers.isEven(4));
    }

    @Test
    public void TestPositive() {
        assertTrue(numbers.isPositive(55));
    }

    @Test
    public void TestPrime() {
        assertTrue(numbers.isPrime(3));
    }

    @Test
    public void TestStringMatching() {
        assertTrue(numbers.stringMatch("my name is mohammed", "name"));
    }

    @Test
    public void TestFactorial() {
        assertEquals(numbers.factorial(3), 6);
    }

    @Test
    public void TestGcd() {
        assertEquals(numbers.gcd(4, 2), 2);
    }

    @Test
    public void TestSortedArray() {
        assertArrayEquals(numbers.bubbleSort(new int[]{1, 2, 3}), new int[]{1, 2, 3, 4});

    }

    @Test
    public void TestNumberRadius() {
        assertEquals(numbers.circleRadius(45), 6358.5);

    }

    @Test
    public void TestSumOFarray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(numbers.checkSumOfArrayNumbers(list), 3);

    }

    @Test
    public void TestcheckIfTowNumbersAreCompatible() {

        assertTrue(numbers.checkIfTowNumbersAreCompatible(4, 2));

    }

    @Test
    public void TestPower() {

        assertEquals(numbers.power(4, 2), 16);

    }

    @Test
    public void TestSqrt() {

        assertEquals(numbers.sqrt(4), 2);

    }

    @Test
    public void TestFactor() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        assertEquals(numbers.getFactors(8), list);

    }

    @Test
    public void TestFileExtension()
    {
        File f = new File("a.pdf");
        assertEquals(numbers.fileExtension(f),"pdf");
    }

    @Test
    public void TestTimeCoversion()
    {
        assertEquals(numbers.convert24Hoursto12Hours("23:22:12"),"11:22:12 PM");
    }





    @AfterClass
    public static void tearDown() {
        numbers = null;

    }
}
