/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

import java.util.Comparator;

/**
 *Comparator con capitales
 * @author Juan Calors Huerta Llamas
 */


public class ComparaCapitales implements Comparator<Paises>{
    @Override
    public int compare(Paises o1, Paises o2) {
        return (o1.getCapital().compareToIgnoreCase(o2.capital));
    }
}
