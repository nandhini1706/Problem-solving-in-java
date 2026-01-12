package problemsolving;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int r,temp,n,sum;
		n=in.nextInt();
		temp=n;
		sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("The number "+sum+" is palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}
}
