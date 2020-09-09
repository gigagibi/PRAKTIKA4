package com.company;

public class Square extends Rectangle {
    Square(double side)
    {
        super(side, side, "Black", false);
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
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
