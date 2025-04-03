
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
    public static String calcularHash(String senha){
        String hashSHA1 = "";
        try{
           MessageDigest sha1 = MessageDigest.getInstance("SHA1");
           
           sha1.update(senha.getBytes());
           
           byte[] digest = sha1.digest();
           
           StringBuilder sb = new StringBuilder();
           for(byte b : digest){
               sb.append(String.format("%02x", b));
           }
           hashSHA1 =sb.toString()
;        } catch(NoSuchAlgorithmException ex){
            System.err.println("Algoritimo SHA1 não encontrado");
         }
        return hashSHA1;
    } 
}
