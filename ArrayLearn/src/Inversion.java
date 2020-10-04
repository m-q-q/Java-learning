
public class Inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int t;
		a[0] = (int)(Math.random()*100);
		a[1] = (int)(Math.random()*100);
		a[2] = (int)(Math.random()*100);
		a[3] = (int)(Math.random()*100);
		a[4] = (int)(Math.random()*100);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("数组："+a[i]);
		}
		for(int i = 0;i<a.length/2;i++)
		{
			t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("数组倒置："+a[i]);
		}
	}

}
