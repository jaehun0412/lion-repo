package day09;

import java.util.Objects;

public class Pen {

    private String color;

    public Pen(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Pen pen = (Pen) object;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return color + " pen";
    }
}
