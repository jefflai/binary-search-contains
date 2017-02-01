package com;

public class App {
    public static boolean contains(int[] array, int integer) {
        if (array == null || array.length == 0) {
            return false;
        }
        int lowerLimit = 0;
        int upperLimit = array.length - 1;
        int oldIndex = -1;
        int newIndex = 0;

        while (oldIndex != newIndex) {
            oldIndex = newIndex;
            newIndex = (lowerLimit + upperLimit) / 2;
            if (array[newIndex] > integer) {
                upperLimit = newIndex - 1;
            } else if (array[newIndex] < integer) {
                lowerLimit = newIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
