
//input number 121----->121(Pelindrome number)


import java.util.Scanner;

public class PelindromeNumber {
	public static void main(String[] args) {
		int n,c,s=0,r;
		System.out.println("Enter any Number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();	
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
			System.out.println("Pelindrome Number");
		else
			System.out.println("Not Pelindrome Number");
	}
}
