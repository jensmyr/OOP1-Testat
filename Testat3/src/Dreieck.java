public class Dreieck {
		// Instanzvariablen
		private int hoehe;
		private int grundseite;
		
		// Konstruktor
		public Dreieck(int hoehe, int grundseite) {
			this.hoehe = hoehe;
			this.grundseite = grundseite;
		}

		// Getter-Methoden
		public int getHoehe() {
			return hoehe;
		}
		public int getGrundseite() {
			return grundseite;
		}
		
		// Setter-Methoden
		public void setHoehe(int hoehe) {
			this.hoehe = hoehe;
		}
		public void setGrundseite(int grundseite) {
			this.grundseite = grundseite;
		}
		
		// Methode zur Berechnung der Fläche
		public double flaeche() {
			return 0.5 * grundseite * hoehe;
		}
	}