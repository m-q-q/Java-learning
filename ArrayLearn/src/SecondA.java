
public class SecondA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [5][5];
		int m=0,n=0;
		for(int i = 0;i<5;i++)
		{
			for(int j =0 ;j<5;j++)
			{
				a[i][j]=(int)(Math.random()*100);
			}
		}
		int max = a[0][0];
		System.out.print("二维数组");
		for(int i = 0;i<5;i++)
		{
			for(int j =0 ;j<5;j++)
			{
				System.out.print(a[i][j]+"  ");
				if(a[i][j]>max)
				{
					max = a[i][j];
					m = i;
					n = j;
				}
			}
			System.out.println();
		}
		System.out.println("最大值:" +max);
		System.out.print("其坐标为：["+m+"][" +n+"]");
	}

}
