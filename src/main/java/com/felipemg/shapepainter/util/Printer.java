package com.felipemg.shapepainter.util;

public final class Printer {

    public static final char CHARACTER = '*';
    public static final char WHITE_SPACE = ' ';
    public static final String NEW_LINE = String.format("%n");

    private Printer(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static String printCharacterNTimes(char character, int n) {
        StringBuilder builder = new StringBuilder();
        for (int times = 1; times <= n; ++times) {
            builder.append(character);
        }
        return builder.toString();
    }

}
