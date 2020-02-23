package taocan;

public  class HanbaoKeleBuilder extends OrderBuilder{
private Order hanbaokele=new Order();
private FactoryProducer factoryProducer=new FactoryProducer();
@Override
public void buildFood(){
	AbstractOrderComponentFactory foodFactory=factoryProducer.getFactory("food");
	hanbaokele.setFood(foodFactory.getFood("hanbao"));
}
public void buildDrink(){
	AbstractOrderComponentFactory drinkFactory=factoryProducer.getFactory("drink");
	  hanbaokele.setDrink(drinkFactory.getDrink("kele"));
}
public Order getOrder(){
	return this.hanbaokele;
}
//@Override
//public void buildDrink() {
//	// TODO Auto-generated method stub
//	
//}
}
