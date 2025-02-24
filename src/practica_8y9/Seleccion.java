/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Clase que representa el algoritmos de seleccion
 * @author Juan Carlos Huerta Llamas
 */
public class Seleccion {
    /**
     * Este es para ordenar los numeros
     * @param A 
     */
    public void Seleccionnumeros(Paises A[]) {
        int i, j, menor, pos;
        Paises tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i].getCodigo();
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j].getCodigo()< menor) {
                    menor = A[j].getCodigo();
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
    /**
     * Este es para ordenar los paises
     * @param A 
     */
    public  void SeleccionPais(Paises A[]) {
        int i, j,pos;
        String menor ;
        Paises tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i].getPais();
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j].getPais().compareToIgnoreCase(menor) < 0) {
                    menor = A[j].getPais();
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
    /**
     * Este es para ordenar los continentes
     * @param A 
     */
    public  void SeleccionContinente(Paises A[]) {
        int i, j,pos;
        String menor ;
        Paises tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i].getContinente();
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j].getContinente().compareToIgnoreCase(menor) < 0) {
                    menor = A[j].getContinente();
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
    /**
     * Este es para ordenar la capital
     * @param A 
     */
    public  void SeleccionCapital(Paises A[]) {
        int i, j,pos;
        String menor ;
        Paises tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i].getCapital();
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j].getCapital().compareToIgnoreCase(menor) < 0) {
                    menor = A[j].getCapital();
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
}
