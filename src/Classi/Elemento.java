package Classi;

import java.util.Vector;

public class Elemento {
	private String posti;
	private Vector<Prenotazione> PR;
	private Vector<Prenotazione> prenotazioni;
	
	public Elemento(String posti, Vector<Prenotazione> pR) {
		super();
		this.posti = posti;
		PR = pR;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public String getPosti() {
		return posti;
	}

	public Vector<Prenotazione> getPR() {
		return PR;
	}
	
	
}
