
public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a,b,c,t;
		for(i=100;i<1000;i++)
		{
			a=i/100;
			b=(i%100)/10;
			c=i%10;
			t=a*a*a+b*b*b+c*c*c;
			if(t==i)
			{
					System.out.println(i);
			}
		}
	}

}
