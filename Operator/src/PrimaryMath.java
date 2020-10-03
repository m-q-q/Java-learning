
public class PrimaryMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		for(a=1;a<8;a++)
		{
			for(b=1;b<8;b++)
			{
				for(c=1;c<14;c++)
				{
					for(d=1;d<10;d++)
					{
						if(a+b==8 && a+c==14 && b+d==10 && c-d==6)
						{
							System.out.println(+a+"+"+b+"=8");
							System.out.println("+ +");
							System.out.println(+c+"-"+d+"=6");
							System.out.println("=  =");
							System.out.println("14 10");
							
						}
					}
				}
			}
		}
	}

}
