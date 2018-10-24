import java.util.Scanner;


/* 
 
* Author: 
 Jacqueline Newland
* Date:
 09/10/2018
* Programming Assigment 1 Doomsday

* Due: 09/10/2018 
* Program Description: 
Doomsday Calculator, input a year to find out the day of the week for Doomsday.
 
* Honor Code: <replace this text with gmu honor code - one or two sentences>
 * 
 */



public class DoomsdayCalculator{
 
  
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Welcome to Doomsday Calculator!");
		System.out.println("Enter year:");
		year = input.nextInt();

		int c = year/100;
		int y = year%100;
		int anchor = (3 + 5 * (c % 4)) % 7;
		int doomsday = (anchor + ((y/12) + y % 12 + ((y % 12)/4))) % 7;

		System.out.println("Weekdays numbering [0 = Saturday, 1 = Sunday, ... , 6 = Friday]");
		System.out.println("Anchor Day: day " + anchor);
		System.out.println("The Doomsday of " + year + ": day " + doomsday);
	}


}