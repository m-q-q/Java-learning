import java.util.Scanner;

public class Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("第一个数：" +a);
	int b = s.nextInt();
	System.out.println("第二个数：" +b);
	System.out.println("比较 "+a+">"+b+":" +(a>b));
	System.out.println("比较 "+a+"<"+b+":" +(a<b));
	System.out.println("比较 "+a+">="+b+":" +(a>=b));
	System.out.println("比较 "+a+"<="+b+":" +(a<=b));
	System.out.println("比较 "+a+"=="+b+":" +(a==b));
	  
	}

}
