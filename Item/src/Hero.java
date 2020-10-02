
public class Hero {
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移速
	//超神
	void legendary()
	{
		System.out.println("超神");
	}
	//获取当前血量
	float getHp(){
		return hp;
	}
	//回血
	void recovery(float blood){
		hp = hp + blood;
	}
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.moveSpeed = 350;
		garen.hp = 3000;
		garen.armor = 200;
		garen.recovery(50);
		garen.legendary();

	}

}
