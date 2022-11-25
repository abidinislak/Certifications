package org.example.operators;

public class UtilTest {


	public static void main(String[] args) {
		System.err.println(4.1 % 3.1);   //0.9999999999999996


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

		short w = 14;
		float x = 13;
		double y = 30;
		var z = w * x / y; //double


//		float egg = 2.0 / 9; // DOES NOT COMPILE
//		int tadpole = (int)5 * 2L; // DOES NOT COMPILE
//		short frog = 3 - 2.0; // DOES NOT COMPILE
//		var frog = 3 - 2.0; // double

//
//		int fish = 1.0; // DOES NOT COMPILE
//		short bird = 1921222; // DOES NOT COMPILE
//		int mammal = 9f; // DOES NOT COMPILE
//		long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE
//		long reptile = 192_301_398_193_810_323L; //   COMPILE

//		long reptile = (long)192301398193810323; // DOES NOT COMPILE... çünkü integer omayan şey, ineteger miş gibi davranmaya çalışıyor

		System.out.print(2147483647 + 1); // -2147483648


	}
}
