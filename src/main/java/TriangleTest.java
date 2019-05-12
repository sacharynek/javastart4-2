public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 9, 8);
        System.out.println(RightTriangleTester.isRightTriangle(triangle));
        Triangle t2 = new Triangle(3, 4,5);
        System.out.println(RightTriangleTester.isRightTriangle(t2));
        Triangle t3 = new Triangle();
        System.out.println(RightTriangleTester.isRightTriangle(t3));
        Triangle t4 = new Triangle(-1,-1,-1);
        System.out.println(RightTriangleTester.isRightTriangle(t4));
    }
}
