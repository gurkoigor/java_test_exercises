public class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment = new Shipment(10, 20, 15, 10, 3.14);

        System.out.println("V shipment = " + shipment.volume());
        System.out.println("Weight shipment = " + shipment.weight);
        System.out.println("Cost shipment = " + shipment.cost);
    }
}
