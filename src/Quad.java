import java.util.Objects;

public class Quad extends Shape {
    private double side;

    public Quad(double side) {
        super("Quad");
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double square() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return side == quad.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
