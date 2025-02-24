/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Clase que representa el algoritmo Quicksort
 * @author Juan Carlos Huerta Llamas
 */
public class Quicksort {
    Tiempo tiempo;

    public Quicksort() {
        tiempo = new Tiempo();
    }

    /**
     * El auxiliar para los continentes
     * @param m
     * @throws InterruptedException 
     */
    public void Quicksortauxiliar(Paises[] m) throws InterruptedException {

        QuicksortContinente(m, 0, m.length - 1);
    }
    /**
     * El auxiliar para los paises
     * @param m
     * @throws InterruptedException 
     */
    public void Quicksortauxiliar2(Paises[] m) throws InterruptedException {

        QuicksortPais(m, 0, m.length - 1);
    }
    /**
     * El auxiliar para las capitales
     * @param m
     * @throws InterruptedException 
     */
    public void Quicksortauxiliar3(Paises[] m) throws InterruptedException {

        QuicksortCapital(m, 0, m.length - 1);
    }
    /**
     * Este quicksort es para ordenar los continentes
     * @param m
     * @param inferior
     * @param superior
     * @throws InterruptedException 
     */
    public void QuicksortContinente(Paises[] m, int inferior, int superior) throws InterruptedException {
       
        int izquierda, derecha;
        Paises mitad, x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda + derecha) / 2];

        do {
            while (m[izquierda].getContinente().compareTo(mitad.getContinente()) < 0 && izquierda < superior) {
                izquierda++;
            }
            while (mitad.getContinente().compareTo(m[derecha].getContinente()) < 0 && derecha > inferior) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (inferior < derecha) {
            QuicksortContinente(m, inferior, derecha);
        }

        if (izquierda < superior) {
            QuicksortContinente(m, izquierda, superior);
        }

        
    }
    /**
     * Este quicksort es para ordenar los paises
     * @param m
     * @param inferior
     * @param superior
     * @throws InterruptedException 
     */
    public void QuicksortPais(Paises[] m, int inferior, int superior) throws InterruptedException {
       
        int izquierda, derecha;
        Paises mitad, x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda + derecha) / 2];

        do {
            while (m[izquierda].getPais().compareTo(mitad.getPais()) < 0 && izquierda < superior) {
                izquierda++;
            }
            while (mitad.getPais().compareTo(m[derecha].getPais()) < 0 && derecha > inferior) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (inferior < derecha) {
            QuicksortPais(m, inferior, derecha);
        }

        if (izquierda < superior) {
            QuicksortPais(m, izquierda, superior);
        }
 
    }
    /**
     * Este quicksort es para ordenar las capitales
     * @param m
     * @param inferior
     * @param superior
     * @throws InterruptedException 
     */
    public void QuicksortCapital(Paises[] m, int inferior, int superior) throws InterruptedException {
       
        int izquierda, derecha;
        Paises mitad, x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda + derecha) / 2];

        do {
            while (m[izquierda].getCapital().compareTo(mitad.getCapital()) < 0 && izquierda < superior) {
                izquierda++;
            }
            while (mitad.getCapital().compareTo(m[derecha].getCapital()) < 0 && derecha > inferior) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (inferior < derecha) {
            QuicksortCapital(m, inferior, derecha);
        }

        if (izquierda < superior) {
            QuicksortCapital(m, izquierda, superior);
        }

        
    }
    /**
     * Este quicksort espara ordenar los numeros
     * @param m
     * @param inferior
     * @param superior
     * @throws InterruptedException 
     */
    public void Quicksortnumeros(Paises[] m, int inferior, int superior) throws InterruptedException {
        int izquierda, derecha;
        Paises mitad, x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda + derecha) / 2];

        do {
            while (m[izquierda].getCodigo()< (mitad.getCodigo()) && izquierda < superior) {
                izquierda++;
            }
            while (mitad.getCodigo()< m[derecha].getCodigo()&& derecha > inferior) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (inferior < derecha) {
            Quicksortnumeros(m, inferior, derecha);
        }

        if (izquierda < superior) {
            Quicksortnumeros(m, izquierda, superior);
        }

    }

}

