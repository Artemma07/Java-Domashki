public class ShapeTester {
    public static void main(String[] args) {
        // Создаем объекты разных форм
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        Shape shape3 = new Square(3);

        // Выводим информацию о каждой фигуре
        printShapeInfo(shape1);
        printShapeInfo(shape2);
        printShapeInfo(shape3);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Тип фигуры: " + shape.getType());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println();
    }
}