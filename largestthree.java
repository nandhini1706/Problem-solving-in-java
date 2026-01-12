package problemsolving;
import java.util.*;
public class largestthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int a,b,c;
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b&&a>c) {
	System.out.println(a+" is greater");
}
else if(b>a&&b>c) {
	System.out.println(b+" is greater");
}
else {
	System.out.println(c+" is greater");
}
	}

}
