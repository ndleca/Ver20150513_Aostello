package Classi;

import java.util.Vector;

public class Cliente
{
	private String nome;
	private String cognome;
	private String numero;
	private String ID;
	private Vector<Prenotazione> prenotazioni;
	
	public Cliente(String nome, String cognome, String numero, String ID){
		if(nome == null)
			throw new IllegalArgumentException("Nome nullo");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("nn va");
		this.nome = nome;
		
		if(cognome == null)
			throw new IllegalArgumentException("Cognome null");
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("nn va");
		this.cognome = cognome;
		
		if(numero == null)
			throw new IllegalArgumentException("Numero null");
		if(numero.length() <= 0)
			throw new IllegalArgumentException("nn va");
		this.numero = numero;
		
		if(ID == null)
			throw new IllegalArgumentException("ID null");
		if(ID.length() <= 0)
			throw new IllegalArgumentException("nn va");
		this.ID = ID;
		
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public String getNome(){
		return nome;
	}

	public String getCognome(){
		return cognome;
	}

	public String getNumero(){
		return numero;
	}

	public String getID(){
		return ID;
	}
	
	public Vector<Prenotazione> getPrenotazioni(){
		return prenotazioni;
	}

	public void addPrenotazione(Prenotazione pippo){
		if(pippo == null)
			throw new IllegalArgumentException("Prenotazione null");
		this.prenotazioni.addElement(pippo);
	}
	
	public int getNumeroOre(){
		int numeroOre = 0;
		for(Prenotazione p : this.prenotazioni)
			numeroOre += ;
		return numeroOre;
	}
	
	public double getRicavoTotale(){
		double ricavoTotale = 0;
		for(Prenotazione p : this.prenotazioni)
			ricavoTotale += ;
		return ricavoTotale;
	}

	@Override public String toString(){
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", numero="
				+ numero + ", ID=" + ID + ", numero prenotazioni="
				+ prenotazioni.size() + "]";
	}
}