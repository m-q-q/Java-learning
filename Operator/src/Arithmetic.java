import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("第一个整数:" +a);
		long b = s.nextInt();
		System.out.println("第二个整数：" +b);
		int c =(int)(a+b);
		long d = a+b;
		System.out.println("两个数的和:" +c);
		System.out.println("两个数的和:" +d);
		
		//自增
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);
		
		//BMI
		float height = s.nextFloat();
		System.out.println("身高:"+height);
		float weight = s.nextFloat();
		System.out.println("体重:"+weight);
		float BMI = weight/(height*height);
		System.out.println("BMI值:"+BMI);
	}

}
