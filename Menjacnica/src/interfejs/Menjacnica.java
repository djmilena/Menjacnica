package interfejs;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface Menjacnica {

	public void dodajKurs(String skrNaziv, GregorianCalendar datum, double kupovni, double prodajni);
	public void obrisiKurs(String skrNaziv, GregorianCalendar datum);
	public Valuta nadjiKurs(String skrNaziv, GregorianCalendar datum);
	
}
