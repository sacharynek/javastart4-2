package triangle;

public class RightTriangleTester {

    static boolean isRightTriangle(Triangle triangle) {
        boolean output = false;
        int[] ordSides = orderTriangleSides(triangle);
        int[] ordSidesSquares = powerArray(ordSides);
        if (ordSidesSquares[0] + ordSidesSquares[1] == ordSidesSquares[2]) {
            output = true;
        }
        return output;
    }

    private static int[] orderTriangleSides(Triangle triangle) {
        int[] sides = triangle.getDimensions();
        int n = 3;

        //simple implementation of bubblesort
        do {
            for (int i = 0; i < sides.length - 1; i++) {
                if (sides[i] > sides[i + 1]) {
                    int a = sides[i];
                    sides[i] = sides[i + 1];
                    sides[i + 1] = a;
                }
            }
            n--;
        } while (n > 1);

        for (int a : sides) {
            System.out.println(a);
        }

        return sides;
    }

    private static int[] powerArray(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = array[i] * array[i];
        }

        return output;
    }
}
