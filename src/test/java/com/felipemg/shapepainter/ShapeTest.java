package com.felipemg.shapepainter;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import com.felipemg.shapepainter.util.Printer;
import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

    private StringBuilder builder;

    @Before
    public void init(){
        this.builder = new StringBuilder();
    }

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
        builder.append("*").append(Printer.NEW_LINE);
        assertThat(Shape.square(1), is(builder.toString()));
    }

    @Test
    public void squareOfSize2ShouldReturnAnAsterisk(){
        builder.append("**").append(Printer.NEW_LINE);
        builder.append("**").append(Printer.NEW_LINE);
        assertThat(Shape.square(2), is(builder.toString()));
    }

    @Test
    public void squareShouldReturnSquareOfSize3(){
        builder.append("***").append(Printer.NEW_LINE);
        builder.append("***").append(Printer.NEW_LINE);
        builder.append("***").append(Printer.NEW_LINE);
        assertThat(Shape.square(), is(builder.toString()));
    }

    @Test
    public void squareOfSize4ShouldReturnSquareOfSize4(){
        builder.append("****").append(Printer.NEW_LINE);
        builder.append("****").append(Printer.NEW_LINE);
        builder.append("****").append(Printer.NEW_LINE);
        builder.append("****").append(Printer.NEW_LINE);
        assertThat(Shape.square(4), is(builder.toString()));
    }

    @Test
    public void triangleOfSize1ShouldReturnOneAsterisk(){
        builder.append("*").append(Printer.NEW_LINE);
        assertThat(Shape.triangle(1), is(builder.toString()));
    }

    @Test
    public void triangleOfSize2ShouldReturnTriangle(){
        builder.append(" * ").append(Printer.NEW_LINE);
        builder.append("***").append(Printer.NEW_LINE);
        assertThat(Shape.triangle(2), is(builder.toString()));
    }

    @Test
    public void triangleShouldReturnTriangleOfSize3(){
        builder.append("  *  ").append(Printer.NEW_LINE);
        builder.append(" *** ").append(Printer.NEW_LINE);
        builder.append("*****").append(Printer.NEW_LINE);
        assertThat(Shape.triangle(), is(builder.toString()));
    }

    @Test
    public void triangleOfSize4ShouldReturnTriangleOfSize4(){
        builder.append("   *   ").append(Printer.NEW_LINE);
        builder.append("  ***  ").append(Printer.NEW_LINE);
        builder.append(" ***** ").append(Printer.NEW_LINE);
        builder.append("*******").append(Printer.NEW_LINE);
        assertThat(Shape.triangle(4), is(builder.toString()));
    }

    @Test
    public void diamondOfSize1ShouldReturnOneAsterisk(){
        builder.append("*").append(Printer.NEW_LINE);
        assertThat(Shape.diamond(1), is(builder.toString()));
    }

    @Test
    public void diamondOfSize2ShouldReturnDiamondSize2(){
        builder.append(" * ").append(Printer.NEW_LINE);
        builder.append("***").append(Printer.NEW_LINE);
        builder.append(" * ").append(Printer.NEW_LINE);
        assertThat(Shape.diamond(2), is(builder.toString()));
    }

    @Test
    public void diamondShouldReturnDiamondSize3(){
        builder.append("  *  ").append(Printer.NEW_LINE);
        builder.append(" *** ").append(Printer.NEW_LINE);
        builder.append("*****").append(Printer.NEW_LINE);
        builder.append(" *** ").append(Printer.NEW_LINE);
        builder.append("  *  ").append(Printer.NEW_LINE);
        assertThat(Shape.diamond(), is(builder.toString()));
    }

    @Test
    public void diamondOfSize4ShouldReturnDiamondSize4(){
        builder.append("   *   ").append(Printer.NEW_LINE);
        builder.append("  ***  ").append(Printer.NEW_LINE);
        builder.append(" ***** ").append(Printer.NEW_LINE);
        builder.append("*******").append(Printer.NEW_LINE);
        builder.append(" ***** ").append(Printer.NEW_LINE);
        builder.append("  ***  ").append(Printer.NEW_LINE);
        builder.append("   *   ").append(Printer.NEW_LINE);
        assertThat(Shape.diamond(4), is(builder.toString()));
    }

}