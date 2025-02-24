/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

import java.util.Comparator;

/**
 *Comparator con continentes
 * @author Juan Carlos Huerta Llamas
 */
public class ComparaContinentes implements Comparator<Paises>{

    @Override
    public int compare(Paises o1, Paises o2) {
        return (o1.getContinente().compareToIgnoreCase(o2.continente));
    }
    
}
