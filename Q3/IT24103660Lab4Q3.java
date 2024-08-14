import java.util.Scanner;
  public class IT24103660Lab4Q3{
     public static void main (String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num;
	System.out.println("enter a number: ");
	num = sc.nextInt();
	  
	    String XDD = (num==0)?"Number is Zero":(num>0)?"Positive":"Negative";
		System.out.println(XDD);
	 }
  }
		