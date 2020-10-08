package charactor1;

public class Order {
	public String name = "some hero";
	{
		System.out.println("声明");
	}
	public Order(){
		name = "one hero";
		System.out.println("构造方法");
	}
	{
		name = "the hero";
		System.out.println("块");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order h = new Order();
		System.out.println(h.name);
		
	}

}
