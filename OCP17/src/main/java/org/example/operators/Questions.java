package org.example.operators;

public class Questions {


//	int[] a = new int[3];


//	static void printType(Object o) {
//
//		if (o instanceof Integer bat) {
//
//			System.err.println("int");
//
//		} else if (o instanceof Integer bat && bat < 10) {
//
//
//			System.err.println("small int");
//		} else if (o instanceof Long bat && bat <= 10) {
//			System.err.println("long");
//		}
//
//		default {         // compiler error
//			System.err.println("unnown..");
//
//		};


//QUESTİON 10
//	private DayOfWeek getWeekDay(int day, final int thursday) {
//		int otherDay = day;
//		int Sunday = 0;
//		switch (otherDay) {
//			default:
//			case 1:
//				continue;
//			case thursday:
//				return DayOfWeek.THURSDAY;
//			case 2, 10:
//				break;
//
//			case Sunday:
//				return DayOfWeek.SUNDAY;
//			case DayOfWeek.MONDAY:
//				return DayOfWeek.MONDAY;
//		}
//		return DayOfWeek.FRIDAY;
//	}

	public static void main(String[] args) {


//		question 8
//		Questions.printType(11);


//question 9 ,   FOR OUT PUT 2
//		int count = 0;
//		BUUNY:
//		for (int row = 1; row <= 3; row++)
//			for (int col = 0; col < 3; col++) {
//				if ((col + row) % 2 == 0)
//					continue BUUNY;
//				count++;
//			}
//		System.out.println(count);
//


//questin 15
//		final char a = 'A', e = 'E';
//		char grade = 'B';
//		switch (grade) {
//			default:
//			case a:
//			case 'B': 'C': System.out.print("great ");
//			case 'D': System.out.print("good "); break;
//			case e:
//			case 'F': System.out.print("not good ");
//		}


//question 17

//		int participants = 4, animals = 2, performers = -1;
//		while ((participants = participants + 1) < 10) {
//		}
//		do {
//		} while (animals++ <= 1);
//		for (; performers < 2; performers += 2) {
//		}
//		System.out.println(participants);
//		System.out.println(animals);
//		System.out.println(performers);


//		question 20


//		int height = 1;
//		while (height++ < 10) {
//			long humidity = 12;
//			do {
//				if (humidity-- % 12 == 0)   // ?
//					;
//				int temperature = 30;
//				for (; ; ) {
//					temperature++;
//					if (temperature > 50)    //?
//						;
//				}
//			} while (humidity > 4);
//		}


// question 23
//		if (true) System.err.println("qwe");
//		else System.err.println("qdqwd");
//		else if(true) System.err.println("dwq");


		// question 25

//		String instrument = "violin";
//		final String CELLO = "cello";
//		String viola = "viola";
//		int p = -1;
//		switch (instrument) {
//			case "bass":
//				break;
//			case CELLO:
//				p++;
//			default:
//				p++;
//			case "VIOLIN":
//				p++;
//			case "viola":
//				++p;
//				break;
//		}
//		System.out.print(p);


//		do{
//
//			int sanke=12;
//
//		}while (snake >1);

	}


}


///  What happens   printLocation(Animal.mammal)
//  answer 3
//class Zoo {
//
//	void printLocation(Animal a) {
//
//		long type = switch (a) {
//			case bird -> 1;
//			case fish -> 2;
//			case mammal -> 3;
//			default -> 4;
//
//
//		};
//
//
//	}
//
//	enum Animal {bird, fish, mammal}
//
//
//}