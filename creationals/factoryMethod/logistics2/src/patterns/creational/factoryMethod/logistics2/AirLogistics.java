package patterns.creational.factoryMethod.logistics2;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
