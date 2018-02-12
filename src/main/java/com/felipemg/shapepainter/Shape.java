package com.felipemg.shapepainter;

import com.felipemg.shapepainter.util.Printer;

public final class Shape {

    private Shape(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static String square(int size){
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; ++i) {
            builder.append(Printer.printCharacterNTimes(size,Printer.ASTERISK));
            builder.append(Printer.printNewLine());
        }
        return builder.toString();
    }

    public static String triangle(int size){
        return "";
    }

    public static String diamond(int size){
        return "";
    }

}
