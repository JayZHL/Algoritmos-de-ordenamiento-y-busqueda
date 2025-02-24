/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Clase que representa el algortimos Shellsort
 * @author Juan Carlos Huerta Llamas
 */
public class Shellsort {
    /**
     * Aqui se ordenan los paises
     * @param v 
     */
    public  void ShellsortPaises(Paises v[]){
        
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j].getPais().compareToIgnoreCase(v[j - incremento].getPais()) < 0) {
                        Paises tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    
    }
    /**
     * Aqui se ordenan los continentes
     * @param v 
     */
    public  void ShellsortContinente(Paises v[]){
        
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j].getContinente().compareToIgnoreCase(v[j - incremento].getContinente()) < 0) {
                        Paises tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    
    }
    /**
     * Aqui se ordenan las capitales
     * @param v 
     */
    public  void ShellsortCapital(Paises v[]){
        
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j].getCapital().compareToIgnoreCase(v[j - incremento].getCapital()) < 0) {
                        Paises tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    
    }
    /**
     * Aqui se ordena los numeros
     * @param v 
     */
    public  void Shellsortnumeros(Paises[] v){
        
                final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j].getCodigo()< (v[j - incremento].getCodigo()) ) {
                        Paises tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
    
}
