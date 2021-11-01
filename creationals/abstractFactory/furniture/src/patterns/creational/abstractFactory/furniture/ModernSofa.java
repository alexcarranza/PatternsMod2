package patterns.creational.abstractFactory.furniture;

public class ModernSofa implements Sofa
{
    @Override
    public void relaxOn(String person)
    {
        System.out.println(person + " is relaxing on a modern sofa");
    }
}

