import java.util.Objects;

public class Parallelogram extends Shape {
    private double sideA;
    private double sideB;
    private double corner;

    public Parallelogram(double sideA, double sideB, double corner) {
        super(sideA == sideB? "Quad": "Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.corner = corner;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double square() {
        return sideA * sideB * Math.sin(corner);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0 && (Double.compare(that.corner, corner) == 0 || Double.compare(that.corner, 180 - corner) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, corner);
    }
}
