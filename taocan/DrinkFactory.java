package taocan;

public class DrinkFactory extends AbstractOrderComponentFactory{
	//private Order drink=new Order();
	
	public Food getFood(String type){
		
		return null;
	}
	public Drink getDrink(String type){
	if("kele".equals(type)){
		return new Kele();
	}
	if("chengzhi".equals(type)){
		return new Chengzhi();
	}
	return null;
}
	
//	public abstract Order getOrder(){
//		return 
//	}
}
