package com.epam.rd.autotasks.max;

public class MaxMethod {

    public static int max(int[] values) {

        //throw new UnsupportedOperationException();

        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 9, -2, 5};
        int result = max(array);
        System.out.println("The maximum value in the array is: " + result);
    }
}



