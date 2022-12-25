package org.example.coreApis;

import java.time.*;

public class Main {


	public static void main(String... arg) {
//
//		String asd = """
//				wrwer					asd
//						adasd
//						""";
//
//		System.err.println(asd);
//		System.err.print(".");
//
//
//		String name = "animals";
//		System.out.println(name.substring(3, 3)); // empty string
//		System.out.println(name.substring(3, 2)); // exception
//		System.out.println(name.substring(3, 8)); // exception
//
//		System.out.println("abc".startsWith("a")); // true
//		System.out.println("abc".startsWith("A")); // false
//		System.out.println("abc".endsWith("c")); // true
//		System.out.println("abc".endsWith("a")); // false
//		System.out.println("abc".contains("b")); // true
//		System.out.println("abc".contains("B")); // false
//
//
//		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
//		System.out.println("abcabc".replace("a", "A")); // AbcAbc
//
//
//		System.out.println("abc".strip()); // abc
//		System.out.println("\t a b c\n".strip()); // a b c
//		String text = " abc\t ";
//		System.out.println(text.trim().length()); // 3
//		System.out.println(text.strip().length()); // 3
//		System.out.println(text.stripLeading().length()); // 5
//		System.out.println(text.stripTrailing().length());// 4
//
//
//		var block = """
//				a
//				 b
//				c""";
//		var concat = " a\n"
//				+ " b\n"
//				+ " c";
//		System.out.println(block.length()); // 6
//		System.out.println(concat.length()); // 9
//		System.out.println(block.indent(1).length()); // 10
//		System.out.println(concat.indent(-1).length()); // 7
//		System.out.println(concat.indent(-4).length()); // 6
//		System.out.println(concat.stripIndent().length()); // 6
//
//
//		var str = "1\\t2";
//		System.out.println(str); // 1\t2
//		System.out.println(str.translateEscapes()); // 1 2
//
//
//		System.out.println(" ".isEmpty()); // false
//		System.out.println("".isEmpty()); // true
//		System.out.println(" ".isBlank()); // true
//		System.out.println("".isBlank()); // true

//		System.err.println("       .".isBlank());
//
//		var name = "Kate";
//		var orderId = 5;
// All print: Hello Kate, order 5 is ready
//		System.out.println("Hello " + name + ", order " + orderId + " is ready");
//		System.out.printf("Hello %s, order %d is ready%n",
//				name, orderId);
//		System.out.printf("Hello %s, order %d is ready%n", name, orderId);


		// %f default is 6
//		var pi = 3.14159265359;
//		System.out.format("[%f]", pi); // [3.141593]
//		System.out.format("[%12.8f]", pi); // [ 3.14159265]
//		System.out.format("[%012f]", pi); // [00003.141593]
//		System.out.format("[%12.2f]", pi); // [ 3.14]
//		System.out.format("[%.3f]", pi); // [3.142]


//		The first says to create a StringBuilder containing an empty sequence of characters
//		and assign sb1 to point to it. The second says to create a StringBuilder containing a
//		specific value and assign sb2 to point to it. The first two examples tell Java to manage the
//		implementation details. The final example tells Java that we have some idea of how big the
//		eventual value will be and would like the StringBuilder to reserve a certain capacity, or
//		number of slots, for characters.
//
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder("animal");
//		StringBuilder sb3 = new StringBuilder(10);
//
//		var sb = new StringBuilder("abcdef");
//		sb.delete(1, 3);                                  // sb = adef
//		sb.deleteCharAt(5);                      // exception
//
//		var SB = new StringBuilder("animals");
//		SB.insert(7, "-"); // sb = animals-
//		SB.insert(0, "-"); // sb = -animals-
//		SB.insert(4, "-"); // sb = -ani-mals-
//		System.out.println(SB);
//
//		var builder = new StringBuilder("pigeon dirty");
//		builder.replace(3, 6, "sty");
//		System.out.println(builder); // pigsty dirty
//
//		var one = new StringBuilder();
//		var two = new StringBuilder();
//		var three = one.append("a");
//		System.out.println(one == two); // false
//		System.out.println(one == three); // true


//		var singleString = "hello world";
//		var concat = "hello ";
//		concat += "world";
//		System.out.println(singleString == concat); // false
//
//		var name = "Hello World";
//		var name2 = "Hello World";
//		System.out.println(name == name2); // true
//


//		var a = "asd";
////		var b = "asd";
//////		String c = "asd";
//
//		System.err.println(a == b);
//		System.err.println(a == c);
//		System.err.println(a.equals(b));
//		System.err.println(a.equals(c));


//
//		int[] numAnimals;
//		int[] numAnimals2;
//		int[] numAnimals3;
//		int[] numAnimals5;
//		int[] numAnimals4;

//
//		String[] strings = {"stringValue"};
//		Object[] objects = strings;
//		String[] againStrings = (String[]) objects;
//		againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//		objects[0] = new StringBuilder(); // Careful!
//


//		int[] numbers = {2, 4, 6, 8};
//		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
//		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
//		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
//		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
//		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
//
//		int[] test = {4, 5, 7, 8, 9, 12, 34, 56, 78, 54, 32};
//		var k = 23423;
//
//		Arrays.sort(test);
//
//		System.err.println(test.toString());
//		System.err.println(Arrays.toString(test));
//		System.err.println(Arrays.binarySearch(test, 10));
//		System.err.println(Arrays.binarySearch(test, 13));

//
//		System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));    //-1
//		System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));     //0
//		System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));  //1


//		int[][] vars1; // 2D array
//		int[][] vars2; // 2D array
//		int[][] vars3; // 2D array
//		int[] vars4 [],int[][][] space; // a 2D AND a 3D array
//
//		System.err.println(LocalTime.now());
//		System.err.println(LocalDate.now());
//		System.err.println(LocalDateTime.now());
//		System.err.println(ZonedDateTime.now());
//
//		2022–06–20T06:50+05:30[Asia/Kolkata] // GMT 2022–06–20 01:20
//		2022–06–20T07:50-05:00[US/Eastern] // GMT 2022–06–20 12:50

//		var gun = LocalDateTime.of(2022, Month.JUNE, 14, 14, 30, 15, 2004444444);


//		public static ZonedDateTime of(int year, int month,
//		int dayOfMonth, int hour, int minute, int second,
//		int nanos, ZoneId zone)
//		public static ZonedDateTime of(LocalDate date, LocalTime time,
//				ZoneId zone)
//		public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone)
//
//


//		var d = LocalDate.of(2022, Month.JANUARY, 32) // DateTimeException
//
//		System.err.println("............");
//		var date = LocalDateTime.now();
//		System.err.println(date);
//		date = date.plusDays(1);
//		System.err.println(date);
//		date = date.plusWeeks(2);
//		System.err.println(date);
//		date = date.plusYears(1);
//		System.err.println(date);

//
//		var date = LocalDate.now();
//		System.err.println(date);
//		var eriod = Period.ofMonths(3);
//		date = date.plus(eriod);
//		System.err.println(date);
//
//		var wronasdg = Period.ofDays(23); // every week
//
//		var wrong = Period.ofYears(1);
//		wrong = Period.ofWeeks(1);
//
//		date = date.plus(wrong);
//		System.err.println(date);
//
//		date = date.plus(wronasdg);
//		System.err.println(date);
//
//		System.err.println(wrong);
//
//
//		var period = Period.ofDays(1);
//		System.err.println(period);
//		period = Period.ofYears(1);
//		System.err.println(period);

//
//		var one = LocalTime.of(5, 15);
//		var two = LocalTime.of(6, 30);
//		var date = LocalDate.of(2016, 1, 20);
//		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
//		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//		System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
//


		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 1
		System.out.println(dateTime.getOffset()); // -05:00              carefulyyy
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]     carefulyyy it is 03:30
		System.out.println(dateTime.getHour()); // 3
		System.out.println(dateTime.getOffset()); // -04:00                  carefulyyy

	}
}
