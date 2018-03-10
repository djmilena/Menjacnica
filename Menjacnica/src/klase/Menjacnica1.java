package klase;


import java.util.LinkedList;

import interfejs.Menjacnica;
import valuta.Valuta;

public class Menjacnica1 implements Menjacnica {
	
	private LinkedList<Valuta> listaValuta = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta v) {
		// TODO Auto-generated method stub

		listaValuta.add(v);
	}

	@Override
	public void obrisiKurs(Valuta v) {
		// TODO Auto-generated method stub
		if(listaValuta.contains(v))
			listaValuta.remove(v);

	}

	@Override
	public Valuta nadjiKurs(Valuta v) {
		// TODO Auto-generated method stub

		if(listaValuta.contains(v))
			return v;

		return null;
	}

}
