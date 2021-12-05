package me.hyunsoo.effectivejava.ch_34_enum_than_static_final;

import java.util.Arrays;

public class PlayGround {
    public static void main(String[] args) {
        // Enum은 Operaion.values()를 통해, loop 조회가 가능
        Arrays.stream(Operation.values())
                .forEach((operation) -> {
                    System.out.println(operation.apply(4, 2) + " operation :" + operation);
                });
    }
}
