package task5;

public class Triangle {
    public static boolean isTriangleRectangular(double sideA, double sideB, double sideC){
        return sideC * sideC == (sideA * sideA) + (sideB * sideB);
    }
}
