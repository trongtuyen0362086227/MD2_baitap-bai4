package jav.abc;

import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 100000) + 1;
        }

        System.out.println(array.toString());
        for (int i = 0; i < 100000; i++) {
            for (int j = i + 1; j < 100000; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array.toString());
        stopwatch.stop();
        System.out.println("Thời gian trôi qua: " + stopwatch.getElapsedTime());
    }
}
