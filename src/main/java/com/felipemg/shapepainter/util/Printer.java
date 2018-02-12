package com.felipemg.shapepainter.util;

public final class Printer {

    public static final String ASTERISK = "*";
    public static final String WHITE_SPACE = " ";

    private Printer(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static String printCharacterNTimes(int n, String character) {
        StringBuilder builder = new StringBuilder();
        for (int times = 1; times <= n; ++times) {
            builder.append(printCharacter(character));
        }
        return builder.toString();
    }

    public static String printCharacter(String character){
        return character;
    }

    public static String printNewLine() {
        return String.format("%n");
    }

}
