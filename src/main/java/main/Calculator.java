package main;

/**
 *
 * Test task
 *
 * @author Pavel Kalita
 *
 */

public class Calculator {

    /**
     * Function calculating the sum of two minimal elements
     *
     * @param inputArray array of integers
     * @return sum of two minimum elements
     */

    public int sumOfMinTwoMinElements(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return 0;
        }
        if (inputArray.length == 1) {
            return inputArray[0];
        }

        int minIndex1 = inputArray[0] < inputArray[1] ? 0 : 1;
        int minIndex2 = inputArray[0] > inputArray[1] ? 1 : 0;
        int temp;

        for (int i = 2; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[minIndex1]) {
                temp = minIndex1;
                minIndex1 = i;
                if (inputArray[temp] < inputArray[minIndex2]) {
                    minIndex2 = temp;
                }
            } else {
                if (inputArray[i] < inputArray[minIndex2]) {
                    minIndex2 = i;
                }
            }
        }
        return inputArray[minIndex1] + inputArray[minIndex2];
    }
}
