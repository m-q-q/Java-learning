public class Armor
{
	String name;
	int price;
	int ac;
	/*
	public Armor(String name)
	{
		this.name = name;
	}
	public class Armors extends Armor
	{
		public Armors(String name){
			super(name);
		}
		int ac; //护甲等级
	}
	*/
		public static void main(String[] args) {
			Armor cloth = new Armor();
			cloth.name="布甲";
			cloth.price=300;
			cloth.ac = 15;
			
			Armor chainMail = new Armor();
			chainMail.name="锁子甲";
			chainMail.price=500;
			chainMail.ac = 40;
		}
	
	
}
//？