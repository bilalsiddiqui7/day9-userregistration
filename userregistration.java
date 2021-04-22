import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo
{
	public static boolean firstName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String first=sc.next();
		if (Pattern.matches("^[A-Z][aA-zZ]{2,}", first))
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return firstName();
		}
	}
	public static boolean lastName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name");
		String last=sc.next();
		if (Pattern.matches("^[A-Z][aA-zZ]{2,}", last))
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return lastName();
		}
	}
	public static boolean email()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		String email=sc.next();
		if (Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@" + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$", email))
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return email();
		}
	}
	public static boolean mobileNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String mobile=sc.next();
		if (Pattern.matches("^[0-9]{10}$", mobile))
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return mobileNo();
		}
	}
	public static boolean passwordCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		String password=sc.next();
		if (Pattern.matches("[\\S]{8,}", password) && Pattern.matches(".*[A-Z].*", password) && Pattern.matches(".*[0-9].*", password) && Pattern.matches(".*[\\W]{1}.*", password))
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return passwordCheck();
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to user registration");
		firstName();
		lastName();
		email();
		mobileNo();
		passwordCheck();
	}
}
