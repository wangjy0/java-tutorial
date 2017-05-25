package javaguide.datetime;

import java.util.Scanner;

import org.joda.time.LocalDateTime;


public class DateTime {

	public static void main(String[] args) {
		///*
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		sc.close();
		//*/
		LocalDateTime current = LocalDateTime.now();
		System.out.println("The current local time is: " + current);
		System.out.println("The current local time is: " + current.toString("yyyy-MM-dd HH:mm:ss"));
	}
}
