import java.util.Scanner;

public class IT22340214Lab5Q1{
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third integer: ");
		int c = sc.nextInt();
		
		int smallest = a;
		if(b < smallest) smallest = b;
		if(c < smallest) smallest = c;
		
		int largest = a;
		if(b < largest) largest = b;
		if(c < largest) largest = c;
		
		
		
		System.out.println();
		System.out.println("User enterd numbers are : "+ a + " " + b + " " + c);
		System.out.println("The smallest number is : "+smallest);
		System.out.println("The largest number is : "+largest);
		
		
		
	}
	
}