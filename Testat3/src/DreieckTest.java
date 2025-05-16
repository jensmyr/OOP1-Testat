public class DreieckTest {
	public static void main(String[] args) {
		
		// Objekt der Klasse Dreieck erzeugen
		Dreieck dreieck = new Dreieck(10, 6);
		
		// Methoden aufrufen und Ergebnisse ausgeben
		System.out.println("Höhe: " + dreieck.getHoehe() + " cm");
		System.out.println("Grundseite: " + dreieck.getGrundseite() + " cm");
		
		// Fläche berechnen und ausgeben
		System.out.println("Fläche: " + dreieck.flaeche() + " cm\u00B2");
		System.out.println();
		
		// Höhe und Grundseite ändern
		dreieck.setHoehe(12);
		dreieck.setGrundseite(8);
		
		//Neue Werte und neue Fläche ausgeben
		System.out.println("Neue Höhe: " + dreieck.getHoehe() + " cm");
		System.out.println("Neue Grundseite: " + dreieck.getGrundseite() + " cm");
		System.out.println("Fläche: " + dreieck.flaeche() + " cm\u00B2");
	}
}