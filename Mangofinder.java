package prowork2;
import java.util.*;
public class Mangofinder 
{
	public static void main(String[] args) {
		//i/p scanner
				Scanner sc = new Scanner(System.in);
				int r=sc.nextInt();
				int c=sc.nextInt();
				int t=sc.nextInt();
				sc.close();
	
				if((t<=(r*c))&&(1<=t && t<=r)|| t%r==1 || t%r==0){
					System.out.println("true");
					
				}
				else {
					System.out.println("false");
				}
	}
	
}
