package principles.composition.transport;

public class Human implements Driver
{
    @Override
    public void navigate()
    {
        System.out.println("Drive");
    }
}