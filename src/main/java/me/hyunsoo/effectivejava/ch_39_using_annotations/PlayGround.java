package me.hyunsoo.effectivejava.ch_39_using_annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PlayGround {

    /**
     * Reflection with Annotation ExceptionTest.class
     * Annotation의 value 활용한 Exception Catch Examples
     * 
     * @param args
     * @throws ClassNotFoundException
     */

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("me.hyunsoo.effectivejava.ch_39_using_annotations.TestList");
        Method[] methods = clazz.getDeclaredMethods();
        Arrays.asList(methods).stream()
                .filter((m) -> {
                    return m.isAnnotationPresent(ExceptionTest.class);
                })
                .forEach((m) -> {
                    boolean successFlg = true;
                    System.out.println("===============================");
                    System.out.println(m.getName());
                    try {
                        m.invoke(null);
                    } catch (InvocationTargetException e) {
                        // e.printStackTrace();
                        Throwable exc = e.getCause();
                        System.out.println(m.getName() + "실패 :" + exc);
                        successFlg = false;
                    } catch (Exception e) {
                        successFlg = false;
                    }
                    if (successFlg) {
                        System.out.println(m.getName() + "성공 !");
                    }
                    System.out.println("===============================");
                });

    }

}
