package com.felipemg.shapepainter;

import com.felipemg.shapepainter.util.Printer;

public final class Shape {

    private Shape(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static String square(){
        return square(3);
    }

    public static String square(int size){
        return shape(size, size);
    }

    public static String triangle(){
        return triangle(3);
    }

    public static String triangle(int height){
        return shape(height, height - 1, 1, -1, 2);
    }

    public static String diamond(){
        return diamond(3);
    }

    public static String diamond(int height){
        int width = 2 * height - 1;
        int characters = width - 2;
        StringBuilder builder = new StringBuilder();
        builder.append(triangle(height));
        builder.append(shape(height-1,1,characters,1,-2));
        return builder.toString();
    }

    private static String shape(int height, int characters) {
        return shape(height, 0, characters, 0, 0);
    }

    private static String shape(int height, int spaces, int characters, int spacesModifier, int characterModifier) {
        StringBuilder builder = new StringBuilder();
        for (int rows = 1; rows <= height; ++rows) {
            builder.append(Printer.printCharacterNTimes(Printer.WHITE_SPACE, spaces));
            builder.append(Printer.printCharacterNTimes(Printer.CHARACTER, characters));
            builder.append(Printer.printCharacterNTimes(Printer.WHITE_SPACE, spaces));
            builder.append(Printer.NEW_LINE);
            spaces = spaces + spacesModifier;
            characters = characters + characterModifier;
        }
        return builder.toString();
    }

}
