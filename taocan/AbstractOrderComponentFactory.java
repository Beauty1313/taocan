package taocan;

public abstract class AbstractOrderComponentFactory {
	abstract public Food getFood(String type);
	abstract public Drink getDrink(String type);
	//public abstract Order getOrder();
}
