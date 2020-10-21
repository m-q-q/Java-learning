package charactor;

public class Attack extends Hero implements AD,Mortal{
	public void physicAttack()
	{
		System.out.print("物理攻击");
	}
	public void die()
	{
		System.out.println("物理攻击死亡");
	}
	public static void battleWin(){
        System.out.println("battle");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h =new Attack();
		Hero.battleWin();
		Attack.battleWin();
		h.battleWin();
	}

}
