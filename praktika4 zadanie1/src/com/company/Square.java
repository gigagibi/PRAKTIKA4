package com.company;

public class Square extends Shape {
    private double side;
    Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side
    }

    Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return length;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
