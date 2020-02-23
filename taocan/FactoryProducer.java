package taocan;

public class FactoryProducer {
	public AbstractOrderComponentFactory getFactory(String type){
		if("food".equals(type)){
			return new FoodFactory();
		}
		if("drink".equals(type)){
			return new DrinkFactory();
		}
		return null;
	}
}
