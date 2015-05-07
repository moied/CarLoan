package com.diczag.carloan.business;

public abstract class Extra {
	protected float importo;
	
	public float getImporto() {
		return importo;
	}

	public void setImporto(float importo) {
		this.importo = importo;
	}

	public Extra(float importo, int giorni) {
		this.importo = calcolaCosto(importo, giorni);
	}
	
	private float calcolaCosto(float importo, int giorni) {
		if (giorni < 7) 
			return giorni * importo;
		else
			return (giorni * importo)/2;
	}
}