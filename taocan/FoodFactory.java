package taocan;

public class FoodFactory extends AbstractOrderComponentFactory{
	public Food getFood(String type){
		if("shutiao".equals(type)){
			return new Shutiao();
		}
		if("hanbao".equals(type)){
			return new Hanbao();
		}
		return null;
	}
 public Drink getDrink(String type){
	 return null;
 }
}
