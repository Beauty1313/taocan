package taocan;

public  class ShutiaoChengzhiBuilder extends OrderBuilder{
	private Order shutiaochengzhi=new Order();
	private FactoryProducer factoryProducer=new FactoryProducer();
	@Override
	public void buildFood(){
		AbstractOrderComponentFactory foodFactory=factoryProducer.getFactory("food");
		shutiaochengzhi.setFood(foodFactory.getFood("shutiao"));
	}
	public void buildDrink(){
		AbstractOrderComponentFactory drinkFactory=factoryProducer.getFactory("drink");
		  shutiaochengzhi.setDrink(drinkFactory.getDrink("chengzhi"));
	}
	public Order getOrder(){
		return this.shutiaochengzhi;
	}
//	@Override
//	public void buildDrink() {
//		// TODO Auto-generated method stub
//		
//	}
}
