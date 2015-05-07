package com.diczag.carloan.business;

public class GuidatoreAddizionale extends Extra {
	private int numero;
	
	public GuidatoreAddizionale(int giorni, int numero) {
		super((3.14f * numero), giorni);
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public float calcolaCosto() {
		// TODO Auto-generated method stub
		return super.calcolaCosto(giorni);
		
		return f * getNumero();
	}
	
	
	
}
