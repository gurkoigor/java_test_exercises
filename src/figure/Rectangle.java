package figure;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Rectangle environment");
        return dim1 * dim2;
    }

}
