import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MinimumFinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.print("Wie viele zufällige Zahlen sollen erzeugt werden? ");
		int n = scan.nextInt();		
		
		
		// Array mit fester Länge "n"
		int[] zahlen = new int[n];
		
		
		// Zufallszahlen erzeugen und in Array einfügen
		for (int i = 0; i < n; i++) {
			zahlen[i] = random.nextInt(1001); // Bereich 0-1000
		}
		
		
		// Ausgabe der n erzeugten Zahlen
		System.out.println(n + " erzeugte Zahlen in der Liste.");
		System.out.println("Zahlenliste: " + Arrays.toString(zahlen));
		
		
		// Kleinste Zahl iterativ in Schleife finden
		int min = zahlen[0];
		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i] < min) {
				min = zahlen[i]; // neue Zuweisung für Variable "min"
			}
		}
		
		// Ergebnis der kleinsten Zahl aus Liste
		System.out.println("Die kleinste Zahl aus der Liste ist: " + min);
		
		scan.close();
	}
}