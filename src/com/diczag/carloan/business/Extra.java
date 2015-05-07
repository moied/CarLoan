package com.diczag.carloan.business;

public abstract class Extra {

	float costoUn;
	int giorni;
	
	public Extra(int giorni) {
		this.giorni = giorni;
		}
	
	public float calcolaCosto() {
		if (giorni < 7) 
			return giorni * costoUn;
		else
			return (giorni * costoUn)/2;
	}
}
