import java.util.ArrayList;

public class Geier {
	/**
	 * /** Hier definieren Sie den Konstruktor fuer Objekte Ihrer Klasse (falls
	 * Sie einen eigenen brauchen) Geier
	 */

	public int gibKarte(int naechsteKarte) {
		letzterZug();
		if (naechsteKarte < 0)
			return naechsteKarte + 6;
		return naechsteKarte + 5;

	}

}
