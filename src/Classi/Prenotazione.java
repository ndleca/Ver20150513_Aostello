package Classi;

import java.io.*;
import java.time.*;

public class Prenotazione
{
	private static final int NumeroOre = 0;
	private static final double RicavoTotale = 0;
	private int postiOcupati;
	private LocalDateTime dal;
	private LocalDateTime al;
	private Cliente cliente;
	
	public Prenotazione(int postiOccupati, LocalDateTime dal, LocalDateTime al, Cliente cliente){
		if(postiOccupati <= 0)
			throw new IllegalArgumentException("PostiOcupati negativo");
		this.postiOcupati = postiOccupati;
		if(al.isBefore(dal) || al.equals(dal))
			throw new IllegalArgumentException("ritardato");
		
		if(dal == null)
			throw new IllegalArgumentException("Dal null");
		this.dal = dal;
		
		if(al == null)
			throw new IllegalArgumentException("Al null");
		this.al = al;
		
		if(cliente == null)
			throw new IllegalArgumentException("Cliente null");
		this.cliente = cliente;
	}

	public int getPostiOcupati(){
		return postiOcupati;
	}

	public LocalDateTime getDal(){
		return dal;
	}

	public LocalDateTime getAl(){
		return al;
	}

	public Cliente getCliente(){
		return cliente;
	}
	
	public int getNumeroOre(){	
		return NumeroOre;		
	}
	
	public double getRicavoTotale(){
		return RicavoTotale;
	}
}