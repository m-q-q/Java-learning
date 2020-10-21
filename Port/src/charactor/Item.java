package charactor;

public class Item {
	String name;
	int price;
	public void buy()
	{
		System.out.println("购买");
	}
	public void effect()
	{
		System.out.println("使用后有效果");
	}
	public static void battleWin(){
        System.out.println("battle");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen = new Hero();
		LifePotion lp = new LifePotion();
		Attack at = new Attack();
		Support sp = new Support();
		garen.kill(lp);
		garen.kill(at);
		garen.kill(sp);
		Hero h =new Attack();
		Hero.battleWin();
		Item.battleWin();
	}

}
