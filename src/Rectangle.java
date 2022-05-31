import java.util.Objects;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA == sideB? "Quad": "Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double square() {
        return sideA * sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
}
