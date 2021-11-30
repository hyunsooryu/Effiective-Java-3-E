package me.hyunsoo.effectivejava.ch_39_using_annotations;

public class TestList {

    @ExceptionTest(value = ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(value = ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(value = ArithmeticException.class)
    public static void m3() {
    }
}
