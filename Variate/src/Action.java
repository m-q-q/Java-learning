
public class Action {
	int i = 1;
	public void method1(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Action().method1(5);
	}

}
//采取就近原则，输出离它最近的i；题中参数i更近，所以输出5