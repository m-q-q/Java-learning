
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int min;
		a[0] = (int)(Math.random()*100);
		a[1] = (int)(Math.random()*100);
		a[2] = (int)(Math.random()*100);
		a[3] = (int)(Math.random()*100);
		a[4] = (int)(Math.random()*100);
		System.out.println("数组中各个随机数是：");
		for (int i=0; i< a.length ; i++)
		{
			System.out.println(a[i]);
		}
		min = a[0];
		for (int i=0; i< a.length ; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.print("随机数中最小的是："+min);
	}

}
