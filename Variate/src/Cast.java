public class Cast {

	public static String Cast(Object test) {
		
		return test.getClass().getName().toString();
		
	}

	public static void main(String[] args) {

		short a = 1;
		short b = 2;
		
		System.out.println(Cast(a+b));

	}

 

}
