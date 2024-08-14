import java.util.Scanner;
  public class IT24103660Lab4Q1{
     public static void main (String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num;
	System.out.println("enter a number: ");
	num = sc.nextInt();
	  
	    if(num<0){
			System.out.print("Negative");
		}
		else if(num>0){
			System.out.print("Positive");
		}
		else if(num==0){
			System.out.print("Zero");
		}
	 }
  }
		