package com.meghana;
import java.util.*; 

public class DateAndTimeAPI {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d1 = new Date();
		System.out.println("Current date is " + d1);
		System.out.println(c);

		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

	} 
}
