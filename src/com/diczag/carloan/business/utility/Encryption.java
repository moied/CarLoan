package com.diczag.carloan.business.utility;

import java.math.BigInteger;
import java.security.MessageDigest;

/* Classe di utility che serve per criptare qualsiasi stringa.
 * La decriptazione non serve in quanto che sicurezza ci sarebbe se ci fosse un metodo per decriptare?
 * Per verificare la password basta criptare la stringa inserita e confrontarla con la
 * password già salvata criptata.
 * La stringa criptata che esce fuori dall'algoritmo è formata da 32 caratteri.
 * */

public class Encryption {

	public static String encrypt(String message) {
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(message.getBytes());
            return String.format("%032x",new BigInteger(1,m.digest()));
        }
        catch(Exception e){
            return null;
        }
    }
}
