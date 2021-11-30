package me.hyunsoo.effectivejava.ch_34_enum_than_static_final;

public enum Planet {
    EARTH(5.975e+24, 6.053e6),
    MARS(4.23e4, 2.34),
    VENUS(5.52e4 + 2, 4.213e4);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }

    public double radius() {
        return radius;
    }

    public double surfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }

}
