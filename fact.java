package fact;
import java.util.Scanner;
public class fact {
	public static void main(String[] args) {
		
		//*factorial number using for loop
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			b=b*i;
			
		
		}
		System.out.println("factorial no is:"+b);
		
		
		
//factorial number using while loop
		System.out.print("2nd enter the number");
		
		int num=sc.nextInt();
		int s=1;
		
		int i=1;
		while(i<=num) {
			s=s*i;
			i++;
			
			
		}
		System.out.print("2nd fact number"+s);
	
	
		
		
	
		
		
	}

}
