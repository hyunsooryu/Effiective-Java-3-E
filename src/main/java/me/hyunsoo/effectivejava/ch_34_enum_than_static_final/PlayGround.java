package me.hyunsoo.effectivejava.ch_34_enum_than_static_final;

import java.util.Arrays;

public class PlayGround {
    public static void main(String[] args) {
        Arrays.asList(Planet.values()).stream().forEach(System.out::println);
        System.out.println(Planet.EARTH.surfaceGravity());
        System.out.println(Planet.EARTH.mass());

        assert Planet.EARTH.equals(Planet.EARTH);

        assert "EARTH" == Planet.EARTH.name();
    }
}
