/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

/**
 *
 * @author Desarrollo234
 */
public class Tools {
    public String Capitalizador(String cadena){
         cadena = cadena.toLowerCase();
        String inicial = cadena.charAt(0)+"";
        inicial = inicial.toUpperCase();
        cadena = inicial + cadena.substring(1);
        return cadena;
    }
}
