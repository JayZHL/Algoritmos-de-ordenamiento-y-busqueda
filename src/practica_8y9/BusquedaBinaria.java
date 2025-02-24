/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Clase que representa la busqueda binaria
 * @author Juan Carlos Huerta Llamas
 */
public class BusquedaBinaria {
    /**
     * Implementacion de Busqueda Binaria para los codigos de los paises
     * @param vector
     * @param dato
     * @return 
     */
    public  Paises Busquedabinarianumeros(Paises vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro].getCodigo()== dato) {
                return vector[centro];
            } else if (dato < vector[centro].getCodigo()) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return null;
    }
    /**
     * Implementacion de Busqueda Binaria para comparar los paises
     * @param vector
     * @param dato
     * @return 
     */
    public  Paises Busquedabinariapaises(Paises vector[], String dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro].getPais().equalsIgnoreCase(dato)) {
                return vector[centro];
            } else if (dato.compareToIgnoreCase(vector[centro].getPais())<0 ){
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return null;
    }
    /**
     * Implementacion de busqueda binaria para los continentes
     * @param vector
     * @param dato
     * @return 
     */
    public  Paises Busquedabinariacontinentes(Paises vector[], String dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro].getContinente().equalsIgnoreCase(dato)) {
                return vector[centro];
            } else if (dato.compareToIgnoreCase(vector[centro].getContinente())<0 ){
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return null;
    }
    /**
     * Implementacion de busqueda binaria para las capitales
     * @param vector
     * @param dato
     * @return 
     */
    public  Paises Busquedabinariacapital(Paises vector[], String dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro].getCapital().equalsIgnoreCase(dato)) {
                return vector[centro];
            } else if (dato.compareToIgnoreCase(vector[centro].getCapital())<0 ){
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return null;
    }
}
