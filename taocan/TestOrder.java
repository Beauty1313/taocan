package taocan;

public class TestOrder {
	public static void main(String[] args){
		HanbaoKeleBuilder hanbaokeleBuilder=new HanbaoKeleBuilder();
		OrderDirector hanbaokeleDirector=new OrderDirector(hanbaokeleBuilder);
		hanbaokeleDirector.construct();
		Order hanbaokele=hanbaokeleBuilder.getOrder();
		System.out.println("�����Ϳ�������");
		hanbaokele.getFood().function();
		hanbaokele.getDrink().function();
	}
}
