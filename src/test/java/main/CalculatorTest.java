package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnZeroWhenArrayIsEmpty() {
        int[] input = {};
        assertEquals(0, calculator.sumOfMinTwoMinElements(input));
    }

    @Test
    public void shouldReturnTheElementWhenArrayConsistsOfOneElement() {
        int[] input = {5};
        assertEquals(5, calculator.sumOfMinTwoMinElements(input));
    }

    @Test
    public void shouldReturnSumWhenInputArrayConsistsOfSameElements() {
        int[] input = {5, 5, 5, 5, 5};
        assertEquals(10, calculator.sumOfMinTwoMinElements(input));
    }

    @Test
    public void testSumOfTwoMinElements() {
        int[] input = {4, 0, 3, 19, 492, -10, 1};
        assertEquals(-10, calculator.sumOfMinTwoMinElements(input));
    }

    @Test
    public void testSumOfTwoMinElementsWhenAllElementIsNegative() {
        int[] input = {-4, -100, -3, -19, -492, -10, -1};
        assertEquals(-592, calculator.sumOfMinTwoMinElements(input));
    }

    @Test(timeout = 4000)
    public void testSumOfTwoMinElements2() {
        int[] input = new int[100000000];
        for (int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 100);
        }
        input[(int) (Math.random() * 100000000)] = -100;
        input[(int) (Math.random() * 100000000)] = -150;
        assertEquals(-250, calculator.sumOfMinTwoMinElements(input));
    }

    @Test(timeout = 4000)
    public void testSumOfTwoMinElements3() {
        int[] input = new int[100000000];
        for (int i = 0; i < input.length; i++) {
            input[i] = (int) ((Math.random() * 1000) - 500);
        }
        input[(int) (Math.random() * 100000000)] = -3000;
        input[(int) (Math.random() * 100000000)] = -1111;
        assertEquals(-4111, calculator.sumOfMinTwoMinElements(input));
    }

    @Test
    public void shouldReturnSumWhenInputArrayConsistsOfChars() {
        int[] input = {'a', '1', -']', '0', -'5'};
        assertEquals(-'5' + -']', calculator.sumOfMinTwoMinElements(input));
    }
}