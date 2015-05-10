package com.diczag.carloan.business.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PricePerDay {
	/** Soglia base giornaliera: Base giornaliera valida fino al settimo giorno */
	public static final int dailyBasisThreshold = 7;
	
	/** Calcola il prezzo in base ai giorni di prenotazione tenendo conto
	 * 	della base giornaliera e settimanale valida per tutte le entità che
	 *  gestiscono il prezzo.	
	 * 
	 * @param price
	 * @param day
	 * @return
	 */
	public static BigDecimal calculate(BigDecimal price, int day) {
		BigDecimal r = null;
		// base giornaliera = prezzo scontato del 60%
		BigDecimal dailyBasis = price.multiply(new BigDecimal("40")).divide(new BigDecimal("100"));
		
		if (day <= dailyBasisThreshold) {
			// prezzo calcolato = prezzo + (base giornaliera * (giorni - 1))
			r = price.add(dailyBasis.multiply(new BigDecimal(String.valueOf(day - 1))));
		} else {
			// base settimanale = prezzo scontato del 80%
			BigDecimal weeklyBasis = price.multiply(new BigDecimal("20")).divide(new BigDecimal("100"));
			// prima settimana = prezzo + (base giornaliera * (soglia base giornaliera - 1))
			// prezzo calcolato = prima settimana + (base settimanale * (giorni - soglia base giornaliera)
			BigDecimal firstWeek = price.add(dailyBasis.multiply(new BigDecimal(String.valueOf(dailyBasisThreshold - 1))));
			r = firstWeek.add(weeklyBasis.multiply(new BigDecimal(String.valueOf(day - dailyBasisThreshold))));
		}
			
		return r.setScale(1, RoundingMode.CEILING);
	}
	
}
