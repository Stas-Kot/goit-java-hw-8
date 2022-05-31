public class Main {
    public static void main(String[] args) {
        Circle shape = new Circle(25);
        Quad quad = new Quad(4.3);
        Triangle triangle = new Triangle(8,8,8);
        Rectangle rectangle = new Rectangle(4,5);
        Parallelogram parallelogram = new Parallelogram(3,2,135);
        Parallelogram parallelogram1 = new Parallelogram(3,2,45);
        ShapeUtil shapeUtil = new ShapeUtil();
        shapeUtil.print(rectangle);
        System.out.println(shape.perimeter());
        System.out.println(quad.perimeter());
        System.out.println(triangle.square());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.square());
        System.out.println(parallelogram.equals(parallelogram1));
    }
}
