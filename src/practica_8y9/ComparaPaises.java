/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

import java.util.Comparator;

/**
 *Comparator para paises
 * @author Juan Carlos Huerta Llamas
 */
public class ComparaPaises implements Comparator<Paises>{
    @Override
    public int compare(Paises o1, Paises o2) {
        return (o1.getPais().compareToIgnoreCase(o2.pais));
    }
    
   
}
