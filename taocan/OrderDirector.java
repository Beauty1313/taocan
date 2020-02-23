package taocan;

public class OrderDirector {
private OrderBuilder orderBuilder;
public void setOrderBuilder(OrderBuilder orderbuilder){
	this.orderBuilder=orderbuilder;
}
public OrderDirector(){
	super();
}
public OrderDirector(OrderBuilder orderBuilder) {

	super();

	this.orderBuilder = orderBuilder;
}
public void construct() {

	orderBuilder.buildFood();
	orderBuilder.buildDrink();
}
}
