package org.example.coreApis;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Questions {

	public static void main(String[] args) {

//		question 1
//		double one = Math.pow(1, 2);
//		int two = Math.round(1.0);
//		float three = Math.random();
//		var doubles = new double[]{one, two, three};


//		question 8

//		var string = "12345";
//		var builder = new StringBuilder("12345");
//		builder.charAt(4);
//		builder.replace(2, 4, "6").charAt(3);
//		builder.replace(2, 5, "6").charAt(2);
//		string.charAt(5);
////		string.length;   // length()
//		string.replace("123", "1").charAt(2);


//		question 10

//		int one = Math.min(5, 3);
//		long two = Math.round(5.5);
//		double three = Math.floor(6.6);
//		var doubles = new double[]{one, two, three};


//		questions 12

		//
		//		var base = "ewe\nsheep\\t";
		//		int length = base.length();
		//		int indent = base.indent(2).length();
		//		int translate = base.translateEscapes().length();
		//		var formatted = "%s %s %s".formatted(length, indent, translate);
		//		System.out.format(formatted);
		//		System.err.println(base);
		//		System.err.println(base.translateEscapes());


//		question 17
//
//		var letters = new StringBuilder("abcdefg");
//
//		System.err.println(letters.substring(5, 5));
//		System.err.println(letters.substring(6, 7));
//		System.err.println(letters.substring(5, 8));


//		question  18

//		String s1 = """
//				abc""";
//
//		s1 += "two";
//
//
//		String s2 = "";
//
//
//		s2 += 2;
//		s2 += 'c';
//		s2 += false;
//		System.err.println(".");
//		System.err.println(s1);
//		System.err.println(".");
//		System.err.println(s2);
//
//		System.err.println(s2.equals("2cfalse"));

//   question 19
//		String[] s1 = {"Camel", "Peacock", "Llama"};
//		String[] s2 = {"Camel", "Llama", "Peacock"};
//		String[] s3 = {"Camel"};
//		String[] s4 = {"Camel", null};
//		System.out.println(Arrays.compare(s1, s2));
//		System.out.println(Arrays.mismatch(s1, s2));
//		System.out.println(Arrays.compare(s3, s4));
//		System.out.println(Arrays.mismatch(s3, s4));
//		System.out.println(Arrays.compare(s4, s4));
//		System.out.println(Arrays.mismatch(s4, s4));


//		question 20

		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime1 = ZonedDateTime.of(date, time, zone);
		var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		int hour = dateTime2.getHour();
		boolean offset = dateTime1.getOffset()
				== dateTime2.getOffset();
		System.out.println("diff = " + diff);
		System.out.println("hour = " + hour);
		System.out.println("offset = " + offset);


	}
}
