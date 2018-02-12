package com.felipemg.shapepainter;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class ShapeTest {

    @Test
    public void squareOfSize0ShouldReturnAnEmptyString(){
        assertThat(Shape.square(0), is(""));
    }

    @Test
    public void triangleOfSize0ShouldReturnAnEmptyString(){
        assertThat(Shape.triangle(0), is(""));
    }

    @Test
    public void diamondOfSize0ShouldReturnAnEmptyString(){
        assertThat(Shape.diamond(0), is(""));
    }

    @Test
    public void squareOfSize1ShouldReturnAnAsterisk(){
        assertThat(Shape.square(1), is(String.format("*%n")));
    }

    @Test
    public void squareOfSize2ShouldReturnAnAsterisk(){
        assertThat(Shape.square(2), is(String.format("**%n**%n")));
    }

    @Test
    public void squareOfSize3ShouldReturn3AnAsterisk(){
        assertThat(Shape.square(3), is(String.format("***%n***%n***%n")));
    }

    @Test
    public void triangleOfSize1ShouldReturnOneAsterisk(){
        assertThat(Shape.triangle(1), is(String.format("*%n")));
    }

    @Test
    public void triangleOfSize2ShouldReturnTriangle(){
        assertThat(Shape.triangle(2), is(String.format(" * %n***%n")));
    }

    @Test
    public void triangleOfSize3ShouldReturnTriangle(){
        assertThat(Shape.triangle(3), is(String.format("  *  %n *** %n*****%n")));
    }

}
