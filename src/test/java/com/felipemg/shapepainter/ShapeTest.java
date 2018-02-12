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

}
