package org.example.operators;

public class UtilTest {


	public static void main(String[] args) {
//		System.err.println(4.1 % 3.1);   //0.9999999999999996


//
//		Numeric Promotion Rules
//		1. If two values have different data types, Java will automatically promote one of the
//		values to the larger of the two data types.
//		2. If one of the values is integral and the other is floating-point, Java will automatically
//		promote the integral value to the floating-point value’s data type.
//		3. Smaller data types, namely, byte, short, and char, are first promoted to int any time
//		they’re used with a Java binary arithmetic operator with a variable (as opposed to a
//				value), even if neither of the operands is int.
//		4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.
//
//


//		int x = 1;
//		long y = 33;
//		var z = x * y;   // long
//		double x = 39.21;
//		float y = 2.1f;
//		var z = x + y;  //doıble


//		short x = 10;
//		short y = 3;
//		var z = x * y;  // int
//		Short zz = x * y;  // cast requried
//
//
//		short w = 14;
//		float x = 13;
//		double y = 30;
//		var z = w * x / y; //double

//		int asdas = 1.2342F;  // does not compile

//		float egg = 2.0 / 9; // DOES NOT COMPILE
//		int tadpole = (int)5 * 2L; // DOES NOT COMPILE
//		short frog = 3 - 2.0; // DOES NOT COMPILE
//		var frog = 3 - 2.0; // double


//		int fish = 1.0; // DOES NOT COMPILE
//		short bird = 1921222; // DOES NOT COMPILE
//		int mammal = 9f; // DOES NOT COMPILE
//		long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE
//		long reptile = 192_301_398_193_810_323L; //   COMPILE


//		long reptile = (long)192301398193810323; // DOES NOT COMPILE... çünkü integer omayan şey, ineteger miş gibi davranmaya çalışıyor

//		System.out.print(2147483647 + 1); // -2147483648


//		int note = 2 + (long) 3;
//		short melody = (byte) (double) (note *= 2);
//		double song = melody;
//		float symphony = (float) ((song == 1_000f) ? song * 2L : song);


//		int myFavoriteNumber = 8;
//		int bird = ~myFavoriteNumber;
//		int plane = -myFavoriteNumber;
//		var superman = bird == plane ? 5 : 10;
//		System.out.println(bird + "," + plane + "," + --superman);


//		float a = 23.23f;
//		a = a + 12;
//		int c = (int) a;
//		var b = 45;
//		var s = a + b;

//
//		String asd = """
//				asd              \nsdfgsfg
//				asdas""";
//
//		System.err.println(asd);

//		var month = 1;
//
//		switch (month) {
//
//			case 1, 2, 3:
//			default:
//				System.out.print("...DEFAULT...");
//				System.out.print("Winter");
//			case 4, 5, 6:
//				System.out.print("Spring");
//
//			case 7, 8, 9:
//				System.out.print("Summer");
//			case 10, 11, 12:
//				System.out.print("Fall");
//
//		}


//		final int getCookies() { return 4; }
//		void feedAnimals() {
//			final int bananas = 1;
//			int apples = 2;
//			int numberOfAnimals = 3;
//			final int cookies = getCookies();
//			switch(numberOfAnimals) {
//				case bananas:
//				case apples: // DOES NOT COMPILE
//				case getCookies(): // DOES NOT COMPILE
//				case cookies : // DOES NOT COMPILE
//				case 3 * 5 :
//			} }


		var asd = 50;


		/// does not compile because of different case operations
//		switch (asd) {
//
//			case 10 -> System.err.println("10..");
//			case 11 -> System.err.println("deneme");
//			case 23:
//				System.err.println("qweqw");
//				case 234-> System.err.println("sdfsd");
//
//		}

		/// compile
//		String ddd = switch (asd) {
//
//			case 12 -> "asd";
//			case 23 -> "System.err.println(2123)";
//			default -> "asdas";
//		};
//


		// wheh we do assigment, we have to defasult
//		var b = 23;
//		var a =
//				switch (b) {
//
//
//					case 45 -> "asd";
//					case 234 -> "asda";
//
//					default -> "qweqw";
//				};

//
//		int k = 345;
//		int df = switch (k) {
//			case 12 -> 234;
//
//			case 453 -> (short) 2;
//			case 234 -> "weq";  // does not compile
//			case 234 -> null;  // does not compile
//			default -> 245;
//
//		};


//		The yield keyword is equivalent to a return statement within a switch expression and
//		is used to avoid ambiguity about whether you meant to exit the block or method around the
//		switch expression.
//		int fish = 34, length = 56;
//		var name = switch (fish) {
//			case 1 -> "Goldfish";
//			case 2 -> {
//				yield "Trout";
//			}
//			case 3 -> {
//				if (length > 10) yield "Blobfish";
//				else yield "Green";
//			}
//			default -> "Swordfish";
//		};


//		for (; ; ) ;


//		int a = 5;
//		for (int b = 34; a < 21; a++) ;


//		int[][] list = {{1, 2, 5, 6, 78,}, {3, 4435, 3453, 34234, 9,}, {3342, 3, 5, 4, 2, 234, 4,}};
//		int searchValue = 4;
//		int positionx = -1;
//		int posionty = -1;
//		PARENT_LOOP:
//		for (int i = 0; i < list.length; i++) {
//
//			for (int j = 0; j < list[i].length; j++) {
//
//
//				if (list[i][j] == searchValue) {
//
//					positionx = i;
//					posionty = j;
//					break PARENT_LOOP;
//				}
//			}
//
//		}
//		if (positionx == -1 && posionty == -1) {
//			System.err.println("there is'nt value");
//		} else {
//
//
//			System.err.println("yes found it," + posionty + "," + positionx);
//		}

		int a = 5;

		long b = a;


	}
}
