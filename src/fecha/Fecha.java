/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fecha {

     private int dia;
    private int mes;
    private int año;
    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.año = a;
        }   
public boolean valida () {
    if (dia < 1 || dia > 31)
        return false;
    if (mes < 1 || mes > 12)
        return false;
// determinamos la cantidad de días del mes:
    int diasMes = 0;
        diasMes = diasMes(diasMes);
if (dia > diasMes)
    return false;
else return true;
}
// … más métodos

    protected int diasMes(int diasMes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: diasMes = 31; break;
            case 4:
            case 6:
            case 9:
            case 11 : diasMes = 30; break;
            case 2 : diasMes = esBisiesto();
                break;
        }       return diasMes;
    }

    protected int esBisiesto() {
        int diasMes;
        // verificación de año bisiesto
        if ( (año % 400 == 0) ||
                ( (año % 4 == 0) && (año % 100 != 0) ) )
            diasMes = 29;
        else diasMes = 28;
        return diasMes;
    }
}
