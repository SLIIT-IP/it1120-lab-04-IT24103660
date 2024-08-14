import java.util.Scanner;
 public class IT24103660Lab4Q2{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		double emarks;
		int lmarks;
		int eper;
		int sper;
		double fin;
	
	System.out.print("Please enter exam marks(out o 100): ");
	emarks = sc.nextDouble();
	
	
	if (100>=emarks && emarks>=0){
		System.out.print("please enter lab sumission");
		lmarks = sc.nextInt();
		if (lmarks>=0 && lmarks<=100){
			System.out.print("Please enter the percentage given for the exam");
		    eper = sc.nextInt();
			
			System.out.print("Please enter the percentage given for the lab sumission");
			sper = sc.nextInt();
			if (eper + sper == 100){
                fin = ((emarks*eper/100)+(lmarks*sper/100));
				System.out.println("Final Exam Mark is: "+fin);	}
			else{
				System.out.println("The percentage must add up to 100. Terminating program");
		}}
	else{
		System.out.println("Invalid input for exam marks. Terminating program");
	}
	
	
	  }
	}
 }
 