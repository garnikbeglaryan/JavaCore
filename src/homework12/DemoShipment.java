package homework12;

public class DemoShipment {

    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10,20,15,10,3.4);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weigth);
    }
}
