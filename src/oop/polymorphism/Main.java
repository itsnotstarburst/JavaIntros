public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Circle();

        shape1.draw();
        shape2.draw(); // Polymorphic behavior
    }
}