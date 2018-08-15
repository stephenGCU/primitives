package edu.gcu.bootcamp.java.primitives;

public class DemoPrimitives {
	
	public static void main (String args[]) {
		
		byte num1 = 126;
		short num2 = 1;
		int num3 = 1;
		long num4 = 1;
		double num5 = 1.0d;
		float num6 = 1.0f;
		int dividend = 9;
		char divisor = 3;
		char ch = 'l';
		boolean bool = true;
		

		System.out.println("This is a String");
		System.out.println("" + num1);
		System.out.println("" + num2);
		System.out.println("" + num3);
		System.out.println("" + num4);
		System.out.println("" + num5);
		System.out.println("" + num6);
		System.out.println("" + ch);
		System.out.println("" + bool);
		
		
		// combining a byte with a char results in an int
		int sum1 = num1 + num2;
		// combining a short with an int results in an int
		int sum2 = num2 + num3;
		// combining a long with an int results in a long
		long sum3 = num3 + num4;
		// combining a double with any other data type(s) results in a double
		double sum4 = num4 + num5;
		//combining a double with any other data type(s) results in a double
		double sum5 = num5 + num6;
		// combining a float with any other data type(s) results in a float
		float sum6 = num1 + num6;
		// combining a double with a float results in a double -- here, double is the "wider" datatype
		double sum7 = num5 + num6;
		
		// combining an int, double, and float results in a double
		double sum8 = num3 + num4 + num5;
		
		// combining char with int results in an int
		int quotient = dividend / divisor;
		

		// 
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println("" + num4);
		
		System.out.println(quotient);
	}
	
}