package task1;

import java.util.Scanner;

public class CommandLineCalculator 
{
	public static void main(String[] args) 
	{
		System.out.println("-----Command Line Calculator-----");
		Scanner sc=new Scanner(System.in);
		String ch;
		do
		{
			System.out.println();
			System.out.println("1.Addition (+)");
			System.out.println("2.Subtraction (-)");
			System.out.println("3.Multiplication (*)");
			System.out.println("4.Division (/)");
			System.out.println("5.Modulus (%)");
			System.out.println("6.Square \t 7.Square Root ");
			System.out.println("8.Cube \t\t 9.Cube Root ");
			System.out.println("10.Minimum and Maximum Number ");
			System.out.println("11.Exit\n");
			
			System.out.println("Enter your Choice (1 to 10)");
			int choice=sc.nextInt();
			
			if(choice>=1 && choice<=10)
			{
				System.out.println("Enter First Number : ");
				double num1=sc.nextDouble();
				
				System.out.println("Enter Second Number : ");
				double num2=sc.nextDouble();
				
				switch(choice)
				{
				case 1:
					System.out.println("Addition Result = "+ (num1+num2));
					break;
				case 2:
					System.out.println("Subtraction Result = "+ (num1-num2));
					break;
				case 3:
					System.out.println("Multiplication Result = "+ (num1*num2));
					break;
				case 4:
					if(!(num2==0))
					{
						System.out.println("Division Result = "+ (num1/num2));	
					}
					else
					{
						System.err.println("Error: Division by zero is not allowed.");
					}
					break;
				case 5:
					if(!(num2==0))
					{
						System.out.println("Modulus Result = "+ (num1%num2));	
					}
					else
					{
						System.err.println("Error: Modulus by zero is not allowed.");
					}
					break;
				case 6:
					System.out.println("Square of 1st Num :"+(num1*num1)+" and Square of 2nd Num :"+(num2*num2));
					break;
				case 7:
					System.out.println("Square Root of 1st Num :"+Math.sqrt(num1)+" and Square Root of 2nd Num :"+Math.sqrt(num2));
					break;
				case 8:
					System.out.println("Cube of 1st Num :"+(num1*num1*num1)+" and Cube of 2nd Num :"+(num2*num2*num2));
					break;
				case 9:
					System.out.println("Cube Root of 1st Num :"+Math.cbrt(num1)+" and Cube Root of 2nd Num :"+Math.cbrt(num2));
					break;
				case 10:
					System.out.println("Minimum number = "+Math.min(num1, num2)+" and Maximum number = "+Math.max(num1, num2));
					break;
				default :
					break;
				}
			}
			else if(choice==11)
			{
				System.out.println("Exiting the calculator. Goodbye!");
                break;
            } 
			else 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
           
			}
			
			System.out.println("\nDo you want to perform another calculation? (Yes/No): ");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("Yes"));
		
		sc.close();
	}

}
