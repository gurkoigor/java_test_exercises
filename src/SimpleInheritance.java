class A {
    int i, j;

    void showij() {
        System.out.println("show i, j = " + i + " " +j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("show k = " + k);
    }

    void sum() {
        System.out.println("sum i, j, k = " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("superOb:");
        superOb.showij();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("superOb:");
        subOb.showij();
        subOb.showk();

        System.out.println("sum:");
        subOb.sum();
    }
}