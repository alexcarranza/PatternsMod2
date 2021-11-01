package patterns.creational.abstractFactory.furniture;

public class VictorianFurnitureFactory implements FurnitureFactory
{
    @Override
    public Chair createChair()
    {
        return new VictorianChair();
    }

    @Override
    public Table createTable()
    {
        return new VictorianTable();
    }
    
    public Sofa createSofa() {
    	return new VictorianSofa();
    }
}