package com.diczag.carloan.business;

public class GuidatoreAddizionale extends Extra {
	private int numero;
	
	public GuidatoreAddizionale(int giorni, int numero) {
		super(giorni);
		super.costoUn = 3.14f;
		this.numero = numero;
	}
	

	@Override
	public float calcolaCosto() {
		// TODO Auto-generated method stub
		float f = super.calcolaCosto();
		
		return f * numero;
	}
	
	
	
}
