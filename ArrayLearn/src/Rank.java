
public class Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[] = new int[(int)(5+Math.random()*5)];
		int q[] = new int[(int)(5+Math.random()*5)];
		int z[] = new int[p.length+q.length];
		System.out.println("数组p");
		for(int i = 0;i<p.length;i++)
		{
			p[i]=(int)(Math.random()*100);
			System.out.println(p[i]+" ");
		}
		System.out.println("数组q");
		for(int i = 0;i<q.length;i++)
		{
			q[i]=(int)(Math.random()*100);
			System.out.println(q[i] +" ");
		}
		System.arraycopy(p, 0, z, 0, p.length);
		System.arraycopy(q, 0, z, p.length,q.length);
		System.out.println("数组z");
		for(int i = 0;i<z.length;i++)
		{
			System.out.println(z[i] +" ");
		}
		
		int a[] = new int[5];
		int b[] = new int[3];
		int t,max=0;
		int k=a[0];
		for(int i=0;i<5;i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.println("数组："+a[i]);
		}
		for(int i=0; i<a.length ; i++)
		{
			for( int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int each : a)
		{
			if(k<each)
			{
				max=each;
			}
		}
		System.out.println("最大值："+max);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("排序："+a[i]);
		}
	}

}
