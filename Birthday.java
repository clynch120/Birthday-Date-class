//Charles Lynch
//Birthday class

import java.util.Scanner;

public class Birthday
{

	public static void main(String[] args) 
	{
		getResult(todaysDate(), yourBirthday());
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
	// shows how many days until your birthday
	public static void getResult(Date todaysDate, Date yourBirthday)
	{
		System.out.println("There are " + todaysDate.daysInMonth() + " days in month #" + todaysDate.getMonth());
		int daysUntil = 0;
		while (false == todaysDate.equals(yourBirthday))
		{
			daysUntil++;
			todaysDate.nextDay();
		}
		if (daysUntil == 0)
		{
			System.out.println("Happy birthday!");
		}
		else
		{
			System.out.println("Numbers of days untill birthday " + yourBirthday.toString() + " : " + daysUntil);
		}
	}
	
}