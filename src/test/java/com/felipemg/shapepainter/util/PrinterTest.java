package com.felipemg.shapepainter.util;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class PrinterTest {

    @Test
    public void printCharacterAsteriskShouldReturnOneAsterisk(){
        assertThat(Printer.printCharacter("*"), is("*"));
    }

    @Test
    public void printCharacterSpaceShouldReturnOneSpace(){
        assertThat(Printer.printCharacter(" "), is(" "));
    }

    @Test
    public void printNewLineShouldReturnNewLineCharacter(){
        assertThat(Printer.printNewLine(), is(String.format("%n")));
    }

    @Test
    public void print3AsterisksShouldReturn3Asterisks(){
        assertThat(Printer.printCharacterNTimes(3,"*"), is("***"));
    }

    @Test
    public void print3SpacesShouldReturn3Spaces(){
        assertThat(Printer.printCharacterNTimes(3," "), is("   "));
    }
}