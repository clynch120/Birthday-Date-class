//Charles Lynch
//Birthday class
import java.util.Scanner;

public class Birthday 
{

	public static void main(String[] args) 
	{
		System.out.println(todaysDate().equals(yourBirthday()));	// check to see if I have done equals right
		
	}
	// ask user for date
	public static Date todaysDate()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("What is today's date (month ex: 2 or 11 and day ex : 5 or 15)? ");
		int month = s.nextInt();
		int day = s.nextInt();
		Date today = new Date (month, day);
		return today;
	}
	// ask user for their birthday
	public static Date yourBirthday()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("What is your birthday (month and day)? ");
		int month = s.nextInt();
		int day = s.nextInt();
		Date birth = new Date (month, day);
		s.close();
		return birth;
	}

}
