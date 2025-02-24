/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

import java.util.Comparator;

/**
 *Comparator con numeros
 * @author Juan Carlos Huerta Llamas
 */
public class ComparaNumeros implements Comparator<Paises>{

    @Override
    public int compare(Paises o1, Paises o2) {
        int a = 0;
        if (o1.getCodigo()== o2.getCodigo()) {
            a = 0;
        }
            else if (o1.getCodigo()<= o2.getCodigo()) {
                        a = -1;
                }else{
                    a = 1;
                }
        
        return a;

        }
}
