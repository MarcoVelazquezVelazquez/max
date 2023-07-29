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
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result == 10); // true
    }
}



