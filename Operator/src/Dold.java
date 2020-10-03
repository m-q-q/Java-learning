
public class Dold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double a = 1.0 ,b = 1.0 ,i,j,m = 1.0,n = 1.0,min = 0.5;
	for(a=1.0;a<20.0;a++)
	{
		for(b=1.0;b<20.0;b++)
		{
			if(a%2!=0 || b%2!=0)
			{
				i = Math.abs((a/b)-0.618);
				if(i<min)
				{
					min = i;
					m = a;
					n = b;
				}
			}
		}
	}
	System.out.println("离黄金分割点最近的两个数为"+(int)m+"/"+(int)n+"="+(m/n));
	}
}
