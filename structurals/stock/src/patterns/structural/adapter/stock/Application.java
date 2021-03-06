package patterns.structural.adapter.stock;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("All is fine when using BarGraphics:");
	     XMLData xmlData = new XMLData("Mexican stocks", "October 2021", 13.56, 17.23);
	     BarGraphics barGraphics = new ConcreteBarGraphics();
	     barGraphics.display(xmlData);

	     System.out.println("We can't use FancyBarGraphics directly:");
	     FancyBarGraphics fancyBarGraphics = new FancyBarGraphics();
	     //fancyBarGraphics.paint(xmlData);

	     System.out.println("We need an adapter:");
	     BarGraphicsAdapter barGraphicsAdapter = new BarGraphicsAdapter(fancyBarGraphics);
	     barGraphicsAdapter.display(xmlData);
	}
}
