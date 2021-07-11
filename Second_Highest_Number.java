import java.util.Scanner;
public class Second_Highest_Number {

	public static void main(String[] args) {
		
		int total_numbers;
		int number;
		int first_high=0;
		int second_high=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many numbers needs for calculation :");
		total_numbers=s.nextInt();
		for(int i=0;i<total_numbers;i++)
		{
			System.out.println("Enter the number "+(i+1)+" :");
			number=s.nextInt();
			if(number>first_high)
			{
			   second_high=first_high;
			   first_high=number;	
			}
			else if(number>second_high)
			{
				second_high=number;
			}
			
		}
		System.out.println("THE SECOND HIGHEST NUMBER IS :"+second_high);

	}

}