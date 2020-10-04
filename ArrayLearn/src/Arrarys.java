import java.util.Arrays;

public class Arrarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [5][8];
		int b[] = new int [40];
		int t = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0; j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.println(a[i][j]);
			}
			System.arraycopy(a[i], 0, b, i*a[i].length, a[i].length);	
		}
		System.out.println("--------");
		for(int i:b){
            System.out.print(i + " ");
        }
		System.out.println();
		Arrays.sort(b);
		for(int i = 0;i<a.length;i++)
		{
			 System.arraycopy(b, i*a[i].length, a[i],0,a[i].length );	         
		}
		System.out.println("--------");
		for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");              
            }   
        }
		
	}

}
