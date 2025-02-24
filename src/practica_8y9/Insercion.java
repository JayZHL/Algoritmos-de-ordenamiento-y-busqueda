/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Clase que representa el algoritmo de insercion
 * @author Juan Carlos Huerta Llamas
 */
public class Insercion {
    
    /**
     * Aqui ordena por paises
     * @param matriz 
     */
    public  void InsercionPais(Paises[] matriz) {

        int i, k = 0;
        int numeroe = matriz.length;

        Paises x;

        for (i = 1; i < numeroe; i++) {

            x = matriz[i];
            k = i - 1;


            while (k >= 0 && x.getPais().compareToIgnoreCase(matriz[k].getPais()) < 0) {

                matriz[k + 1] = matriz[k]; 
                k--;
            }
            matriz[k + 1] = x; 
        }

    }
    /**
     * Aqui ordena por continentes
     * @param matriz 
     */
    public  void InsercionContinente(Paises[] matriz) {

        int i, k = 0;
        int numeroe = matriz.length;

        Paises x;

        for (i = 1; i < numeroe; i++) {

            x = matriz[i];
            k = i - 1;


            while (k >= 0 && x.getContinente().compareToIgnoreCase(matriz[k].getContinente()) < 0) {

                matriz[k + 1] = matriz[k]; 
                k--;
            }
            matriz[k + 1] = x; 
        }

    }
    
    /**
     * Aqui ordena por capitales
     * @param matriz 
     */
    public  void InsercionCapital(Paises[] matriz) {

        int i, k = 0;
        int numeroe = matriz.length;

        Paises x;

        for (i = 1; i < numeroe; i++) {

            x = matriz[i];
            k = i - 1;


            while (k >= 0 && x.getCapital().compareToIgnoreCase(matriz[k].getCapital()) < 0) {

                matriz[k + 1] = matriz[k]; 
                k--;
            }
            matriz[k + 1] = x; 
        }

    }
    /**
     * Aqui ordena por numeros
     * @param matriz 
     */
    public  void Insercionnumeros(Paises[] matriz) {

        int i, k = 0;
        int numeroElementos = matriz.length;

        Paises x;

        for (i = 1; i < numeroElementos; i++) {

            x = matriz[i];
            k = i - 1;
            while (k >= 0 && x.getCodigo()< matriz[k].getCodigo()) {

                matriz[k + 1] = matriz[k]; 
                k--;
            }
            matriz[k + 1] = x;
        }

    }

}
