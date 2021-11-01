package patterns.creational.abstractFactory.furniture;

public class VictorianSofa implements Sofa {
    @Override
    public void relaxOn(String person)
    {
        System.out.println(person + " is relaxing on a victorian sofa");
    }
}
