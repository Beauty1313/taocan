package taocan;

public abstract class OrderBuilder {
	public abstract void buildFood();
	public abstract void buildDrink();
	public abstract Order getOrder();
}
