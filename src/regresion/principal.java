/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regresion;

/**
 *
 * @author vinic
 */
public class principal {

    private static double x[] = new double[12];
    private static double y[] = new double[12];

    public static void main(String[] args) {
        x[0] = 40;
        x[1] = 20;
        x[2] = 25;
        x[3] = 20;
        x[4] = 30;
        x[5] = 50;
        x[6] = 40;
        x[7] = 20;
        x[8] = 50;
        x[9] = 40;
        x[10] = 25;
        x[11] = 50;

        y[0] = 385;
        y[1] = 400;
        y[2] = 395;
        y[3] = 365;
        y[4] = 475;
        y[5] = 440;
        y[6] = 490;
        y[7] = 420;
        y[8] = 560;
        y[9] = 525;
        y[10] = 480;
        y[11] = 510;
        Regresion reg = new Regresion(x, y);

        reg.lineal();
        reg.correlacion();
        System.out.println("Pendiente: " + reg.a);
        System.out.println("Correlacion: " + reg.b);

    }

}
