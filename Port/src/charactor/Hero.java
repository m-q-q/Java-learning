package charactor;

public class Hero {
	String name;
	int armor;
	int hp;
	public void kill(Mortal m)
	{
		m.die();
	}
	public static void battleWin(){
        System.out.println("hero battle win");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
