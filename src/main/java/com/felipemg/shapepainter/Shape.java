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
        StringBuilder builder = new StringBuilder();
        for (int rows = 1; rows <= size; ++rows) {
            builder.append(Printer.printCharacterNTimes(size,Printer.ASTERISK));
            builder.append(Printer.printNewLine());
        }
        return builder.toString();
    }

    public static String triangle(){
        return triangle(3);
    }

    public static String triangle(int height){
        int spaces = height - 1;
        int characters = 1;
        StringBuilder builder = new StringBuilder();
        for (int rows = 1; rows <= height; ++rows) {
            builder.append(Printer.printCharacterNTimes(spaces, Printer.WHITE_SPACE));
            builder.append(Printer.printCharacterNTimes(characters, Printer.ASTERISK));
            builder.append(Printer.printCharacterNTimes(spaces, Printer.WHITE_SPACE));
            builder.append(Printer.printNewLine());
            --spaces;
            characters += 2;
        }
        return builder.toString();
    }

    public static String diamond(){
        return diamond(3);
    }

    public static String diamond(int height){
        int width = 2 * height - 1;
        int spaces = 1;
        int characters = width - 2;
        StringBuilder builder = new StringBuilder();
        builder.append(triangle(height));
        for (int rows = 1; rows <= height-1; ++rows) {
            builder.append(Printer.printCharacterNTimes(spaces, Printer.WHITE_SPACE));
            builder.append(Printer.printCharacterNTimes(characters, Printer.ASTERISK));
            builder.append(Printer.printCharacterNTimes(spaces, Printer.WHITE_SPACE));
            builder.append(Printer.printNewLine());
            ++spaces;
            characters -= 2;
        }
        return builder.toString();
    }

}
