package ojas;
import java.util.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class AgeVerification 
{
	static Scanner sc = new Scanner(System.in);
	void AgeVoting(int a) throws InvalidAgeException
	{
		if(a<18)
		{
			throw new InvalidAgeException("Age not valid");
		}
		else
			System.out.println("Welcome to vote");
	}
	void AgeDegree(int a) throws InvalidAgeException
	{
		if(a<17)
		{
			throw new InvalidAgeException("Age not valid");
		}
		else
			System.out.println("Welcome");
	}
	void AgeMarraige(int a) throws InvalidAgeException
	{
		System.out.println("Enter your gender :\n1 for male\n2 for female");
		int ch;
		ch=sc.nextInt();
		if((ch==1&&a<21)||(ch==2&&a<18))
		{
			throw new InvalidAgeException("Age not valid");
		}
		else
			System.out.println("Welcome");
	}
	public static void main(String args[])
	{
		AgeVerification av = new AgeVerification();
		System.out.println("Enter your age:");
		int age,cho;
		age=sc.nextInt();
		System.out.println("For what do you want to check your age?\nEnter\n1 for Voting\n2 for Degree\n3 for Marraige");
		cho=sc.nextInt();
		switch(cho)
		{
		case 1:
			try
			{
				av.AgeVoting(age);
			}
			catch(Exception m)
			{
				System.out.println("Exception occured: "+m);
			}
			break;
		case 2:
			try
			{
				av.AgeDegree(age);
			}
			catch(Exception m)
			{
				System.out.println("Exception occured: "+m);
			}
			break;
		case 3:
			try
			{
				av.AgeMarraige(age);
			}
			catch(Exception m)
			{
				System.out.println("Exception occured: "+m);
			}
			break;
			default:
				System.out.println("Invalid choice entered!!");
		}
	}
}
