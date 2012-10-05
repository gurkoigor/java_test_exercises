public class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("V weightbox = " + vol);
        System.out.println("Weight weightbox = " + weightbox.weight);

        plainbox = weightbox;

        vol = plainbox.volume();
        System.out.println("V plainbox = " + vol);
        //System.out.println("Weight plainbox = " + plainbox.weight); //plainbox => Box() and has not method weight

    }
}
