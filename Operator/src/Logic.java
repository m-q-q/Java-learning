import java.util.Scanner;
public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = 6;
		int k = a<b ? 1:2;
		if(k==1)
		{
			System.out.println("今天是工作日");
		}
		else
			System.out.println("今天是休息日");
		int i,sum=0;
	    for(i=1;i<11;i++) {
	        sum+=i*2;
	    }
	    System.out.println(sum);
	}

}
