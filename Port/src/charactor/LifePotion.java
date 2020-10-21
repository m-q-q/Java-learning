package charactor;

public class LifePotion extends Item implements Mortal{
	
	public void effect()
	{
		System.out.println("使用后有效果，并有一定加成");
	}
	public void die()
	{
		System.out.println("未及时救治死亡");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
