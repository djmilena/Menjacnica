package valuta;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv;
	private String skrNaziv;
	private GregorianCalendar datum;
	private double kupovniKurs;
	private double srednjiKurs;
	private double prodajniKurs;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null)
			System.err.println("Potrebno je uneti pun naziv valute!");
		this.naziv = naziv;
	}
	public String getSkrNaziv() {
		return skrNaziv;
	}
	public void setSkrNaziv(String skrNaziv) {
		if(skrNaziv == null)
			System.err.println("Potrebno je uneti akronim valute!");
		this.skrNaziv = skrNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum.equals(null))
			System.out.println("Potrebno je uneti datum posmatranja date valute.");
		this.datum = datum;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs < 0)
			System.err.println("Kurs mora imati pozitivnu vrednost!");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs < 0)
			System.err.println("Kurs mora imati pozitivnu vrednost!");
		this.srednjiKurs = srednjiKurs;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs < 0)
			System.err.println("Kurs mora imati pozitivnu vrednost!");
		this.prodajniKurs = prodajniKurs;
	}
	@Override
	public String toString() {
		return "Valuta naziv=" + naziv + ", skrNaziv=" + skrNaziv + ", datum=" + datum + ", kupovniKurs=" + kupovniKurs
				+ ", srednjiKurs=" + srednjiKurs + ", prodajniKurs=" + prodajniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skrNaziv == null) ? 0 : skrNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skrNaziv == null) {
			if (other.skrNaziv != null)
				return false;
		} else if (!skrNaziv.equals(other.skrNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
	
	
}
