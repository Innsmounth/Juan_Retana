package tareas;

import java.util.Calendar;

public class UltimoReloj {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Calendar c = Calendar.getInstance();
                        //sacamos la hora del sistema
                        Thread.sleep(1000);
                        int hora = c.get(Calendar.HOUR);
                        int minuto = c.get(Calendar.MINUTE);
                        int segundo = c.get(Calendar.SECOND);
                        System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
                    } catch (InterruptedException e) {

                    }
                }

            }

        });
        t1.start();

    }
}
