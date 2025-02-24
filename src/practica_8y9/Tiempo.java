/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_8y9;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
/**
 *Esta clase representa nuestros metodos para ir llevando el tiempo de los
 * algoritmos
 * @author Juan Carlos Huerta Llamas
 */
public class Tiempo {
    String temporizador;
    String hora, minuto, segundo;
    Calendar calendario;
    Thread hilo;
    Timer timer;
    TimerTask task;
    int m = 00, s = 00, ms = 00;
    int a;

    public Tiempo() {

    }
    /**
     * Inicia a contar el tiempo
     */
    public void Inicio() {
        timer = new Timer();

        m = ms = 0;
        temporizador = "00:00.000";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("mm:ss.SSS");

        task = new TimerTask() {
            @Override
            public void run() {
                ms++;

                if (ms == 1000) {
                    ms = 0;
                    s++;
                }
                if (s == 60) {
                    s = 0;
                    m++;
                }

                temporizador = m + ":" + s + ":" + ms;

            }

        };

        timer.schedule(task, 0, 1);

    }

    public String Terminar() throws InterruptedException {

        timer.cancel();

        return temporizador;
    }
}

