/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 *Esta clase ayuda a dar de alta la informacion para ser ordenada y buscada
 * @author Juan Carlos Huerta Llamas
 */
public class InfoPaises {
    public Random ran;
    
    
    public InfoPaises() {
    }
    
    /**
     * Aqui se va dando de alta a un array toda la informacion que vamos a ordenar desde
     * un archivo de texto, se utiliza un delimitador para ir separando los
     * datos
     * @param lista 
     */
    public void Alta(Paises[] lista) {
        int i = 0 ;
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("src/Lista.txt");
            String linea;
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                String[] texto ;
                texto = linea.split("-");
                System.out.println("Continente del pais: "+texto[0]);
                System.out.println("Num del pais: "+texto[1]);
                System.out.println("Nombre del pais: "+texto[2]);
                System.out.println("Capital del pais: "+texto[3]);
                Paises a = new Paises(texto[0],Integer.parseInt(texto[1]),texto[2],texto[3]);
                lista[i]=a;
                i++;
            }

            fr.close();
       
        }
        catch (IOException e) {
            System.out.println(e);
        } finally {
            try { 
                if (fr != null) { 
                    fr.close(); 
                } 
            } catch (IOException e) { 
            }
        }

    }
    
    
    /**
     * Se da de alta a un array los paises ordenados por orden alfabetico
     * desde un archivo de texto y despues ser buscado.
     * @param lista 
     */
    public void AltaPaises(Paises[] lista) {
        int i = 0 ;
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("src/PaisesOrdenados.txt");
            String linea;

            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                String[] texto ;
                texto = linea.split("-");
                System.out.println("Continente del pais: "+texto[0]);
                System.out.println("Num del pais: "+texto[1]);
                System.out.println("Nombre del pais: "+texto[2]);
                System.out.println("Capital del pais: "+texto[3]);
                Paises a = new Paises(texto[0],Integer.valueOf(texto[1]),texto[2],texto[3]);
                System.out.println(texto[0]+texto[1]);
                lista[i]=a;
                i++;
            }

            fr.close();
            
        }
        catch (IOException e) {
            System.out.println(e);
        } finally {
            try { 
                if (fr != null) { 
                    fr.close(); 
                } 
            } catch (IOException e) { 
            }
        }

    }
    /**
     * Se da de alta a un array los continentes ordenados por orden alfabetico
     * desde un archivo de texto y despues ser buscado. 
     * @param lista 
     */
    public void AltaContinentes(Paises[] lista) {
        int i = 0 ;
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("src/ContinentesOrdenados.txt");
            String linea;

            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                String[] texto ;
                texto = linea.split("-");
                System.out.println("Continente del pais: "+texto[0]);
                System.out.println("Num del pais: "+texto[1]);
                System.out.println("Nombre del pais: "+texto[2]);
                System.out.println("Capital del pais: "+texto[3]);
                Paises a = new Paises(texto[0],Integer.valueOf(texto[1]),texto[2],texto[3]);
                System.out.println(texto[0]+texto[1]);
                lista[i]=a;
                i++;
            }

            fr.close();
            
        }
        catch (IOException e) {
            System.out.println(e);
        } finally {
            try { 
                if (fr != null) { 
                    fr.close(); 
                } 
            } catch (IOException e) { 
            }
        }

    }
    /**
     * Se da de alta a un array las capitales ordenadas por orden alfabetico
     * desde un archivo de texto y despues ser buscado.  
     * @param lista 
     */
    public void AltaCapitales(Paises[] lista) {
        int i = 0 ;
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("src/CapitalesOrdenados.txt");
            String linea;

            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                String[] texto ;
                texto = linea.split("-");
                System.out.println("Continente del pais: "+texto[0]);
                System.out.println("Num del pais: "+texto[1]);
                System.out.println("Nombre del pais: "+texto[2]);
                System.out.println("Capital del pais: "+texto[3]);
                Paises a = new Paises(texto[0],Integer.valueOf(texto[1]),texto[2],texto[3]);
                System.out.println(texto[0]+texto[1]);
                lista[i]=a;
                i++;
            }

            fr.close();
            
        }
        catch (IOException e) {
            System.out.println(e);
        } finally {
            try { 
                if (fr != null) { 
                    fr.close(); 
                } 
            } catch (IOException e) { 
            }
        }

    }
    
    /**
     * Se da de alta a un array los numeros ordenados 
     * desde un archivo de texto y despues ser buscados. 
     * @param lista 
     */
    public void Altanumeros(Paises[] lista) {
        int i = 0 ;
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("src/NumerosOrdenados.txt");
            String linea;

            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) {
                String[] texto ;
                texto = linea.split("-");
                Paises a = new Paises(texto[0], Integer.valueOf(texto[1]),texto[2],texto[3]);
                
                lista[i]=a;
                i++;
            }

            fr.close();
            
        }
        catch (IOException e) {
            System.out.println(e);
        } finally {
            try { 
                if (fr != null) { 
                    fr.close(); 
                } 
            } catch (IOException e) { 
            }
        }

    }
    
  
//    public void Ordena(Paises[] lista){
//    
//     try {
//            String ruta = "src/Ordnombres.txt";
//            File file = new File(ruta);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            
//           for (Paises Paises : lista) {
//             String[]  c = Paises.getContinente().split(" ");
//                bw.write(c[0]+"-"+c[1]+"-"+c[2]+"-"+Paises.getCodigo()+"\n");
//         }
//            
//            
//            bw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    
//    
//}
//    
//
//    public void Ordenanumeros(Paises[] lista){
//    
//     try {
//            String ruta = "src/Ordnumeros.txt";
//            File file = new File(ruta);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            
//           for (Paises paises : lista) {
//             String[]  c = paises.getCapital().split(" ");
//                bw.write(c[0]+"-"+c[1]+"-"+c[2]+"-"+paises.getCodigo()+"\n");
//         }
//            
//            
//            bw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    
//    
//}
//    
//    
//  
//    public void Nombres() {
//        ran = new Random();
//        Borrar();
//        try {
//            String ruta = "src/Nombres.txt";
//            File file = new File(ruta);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            for (int i = 0; i < 5000; i++) {
//                bw.write(Cadenas() + "-" + Cadenas() + "-"
//                        + Cadenas() + "-" + (ran.nextInt(90001) + 9999) + "\n");
//
//            }
//            bw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//   
//   
//    public String Cadenas() {
//        int alt = (ran.nextInt(3) + 6);
//        char n;
//
//        String cadena = "";
//
//        for (int i = 0; i < alt; i++) {
//            n = (char) (ran.nextDouble() * 26.0 + 65.0);
//            cadena += n;
//        }
//
//        return cadena;
//    }
//
//  
//     public void Borrar() {
//        File fichero = new File("src/Nombres.txt");
//        try {
//
//            if (fichero.exists()) {
//                fichero.delete();
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//    
}

