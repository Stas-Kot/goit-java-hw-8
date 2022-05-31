import java.util.Objects;

public class Circle extends Shape{
    private int radius;
    final private double Pi = Math.PI;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Pi;
    }

    @Override
    public double square() {
        return Pi * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
