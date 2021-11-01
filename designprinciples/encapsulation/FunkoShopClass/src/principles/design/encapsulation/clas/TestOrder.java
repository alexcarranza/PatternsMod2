package principles.design.encapsulation.clas;

public class TestOrder {
    public static void main(String[] args) {

		Item funkoIronMan = new Item(1, 600.00, 2);
		Item funkoThor = new Item(2, 500.00, 3);

        Order order = new Order("MX");
        order.addItem(funkoIronMan);
        order.addItem(funkoThor);

        System.out.println("Total a pagar en MX: " + order.getTotal());

        order.setCountry("US");
        System.out.println("Total a pagar en US: " + order.getTotal());

        order.setCountry("EU");
        System.out.println("Total a pagar en EU: " + order.getTotal());
    }
}