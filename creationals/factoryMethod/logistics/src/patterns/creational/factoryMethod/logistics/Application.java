package patterns.creational.factoryMethod.logistics;

public class Application {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
