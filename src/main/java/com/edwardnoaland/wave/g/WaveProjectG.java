package com.edwardnoaland.wave.g;

/** Small refactoring fixture with direct and indirect callers. */
public final class WaveProjectG {
    private WaveProjectG() {}

    public static String describe(int value) {
        return "project-g:" + calculate(value);
    }

    public static int calculate(int value) {
        return scale(value) + 1;
    }

    private static int scale(int value) {
        if (value < 0) {
            return -scale(-value);
        }
        int doubledValue = value * 2;
        return doubledValue;
    }
}
