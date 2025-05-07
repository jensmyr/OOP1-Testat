public class Datentypen {
	public static void main(String[] args) {
		
		// boolean: 8 Bit - true oder false (Boolescher Wahrheitswert)
		boolean isTrue = true;
		System.out.println("Boolean: " + isTrue);
		System.out.println("Negation: " + !isTrue  + "\n");
		
		// char: 16 Bit - einzelnes Zeichen (Unicode-Zeichen) 
		char charLetter = 'A';
		System.out.println("Char: " + charLetter);
		System.out.println("Char als ASCII-Zahl: " + (int)charLetter  + "\n"); 
		
		// byte: 8 Bit - Ganze Zahl (-128 bis +127)
		byte byteNumber = 127;
		System.out.println("Byte: " + byteNumber);
		System.out.println("Byte Subtraktion mit 27: " + (byteNumber - 27) + "\n");
	
		// short: 16 Bit - Ganze Zahl (-32.768 bis +32.767)
		short shortNumber = 333;
		System.out.println("Short: " + shortNumber);
		System.out.println("Short Multiplikation mit 3: " + (shortNumber * 3) + "\n");
		
		// int: 32 Bit - Ganze Zahl (-2.147.483.648 bis +2.147.483.647) 
		int intNumber = 1000;
		System.out.println("Int: " + intNumber);
		System.out.println("Int < 10: " + (intNumber < 10) + "\n");
		
		// long: 64 Bit - Ganze Zahl (-9.223.372.036.854.775.808 bis +9.223.372.036.854.775.807)
		long longNumber = 9223372036854775807l; // Zahl mit l-Suffix kennzeichnen, damit Compiler Zahl als Long-Datentyp erkennt
		System.out.println("Long: " + longNumber);
		System.out.println("Long modulo 7: " + (longNumber % 7) + "\n");
		
		// float: 32 Bit - Gleitkommazahl (1,40239846E-45 bis 3,40282347E+38)
		float floatNumber = 3.40282347e38f; // Zahl mit f-Suffix kennzeichnen, damit Compiler Zahl als Float-Datentyp erkennt
		System.out.println("Float: " + floatNumber);
		System.out.println("Float Division mit 10E+27: " + (floatNumber / 10e27f) + "\n");
		
		// double: 64 Bit - Gleitkommazahl (4,94065645841246544E-324 bis 1,79769131486231570E+308)
		double doubleNumber = 3.14159d; // Zahl mit d-Suffix kennzeichnen, damit Compiler die Zahl als Double-Datentyp erkennt
		System.out.println("Double: " + doubleNumber);
		System.out.println("Double Vergleich mit PI: " + (doubleNumber == Math.PI));
		
		}
}