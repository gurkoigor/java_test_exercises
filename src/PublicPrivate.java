class PublicPrivateTest {
    int a;
    public int b;
    private int c;

    void setc( int i) {
        c = i;
    }

    int getc() {
        return c;
    }

    int sum() {
        return a + b;
    }
}

class PublicPrivate {
    public static void main(String args[]) {
        PublicPrivateTest ob = new PublicPrivateTest();

        ob.a = 10;
        ob.b = 20;

        ob.setc(ob.sum());
        System.out.println("ob.c = " + ob.getc());
    }
}