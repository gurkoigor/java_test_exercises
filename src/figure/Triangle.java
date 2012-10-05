package figure;

public class Triangle extends Figure{
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Triangle environment");
        return dim1 * dim2 / 2;
    }
}
