/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;

/**
 *Nuestra clase que representa la informacion que vamos a manejar con sus 
 * respectivos setters y getters
 * @author Juan Carlos Huerta Llamas
 */
public class Paises {
    String continente;
    int codigo;
    String pais;
    String capital;

    public Paises(String continente, int codigo, String pais, String capital) {
        this.continente = continente;
        this.codigo = codigo;
        this.pais = pais;
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return continente+"-"+codigo+"-"+pais+"-"+capital;
    }
    
    
}
