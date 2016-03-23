package main;

/**
 * Created by urko on 22/03/16.
 */
public class Calculadora {

    public final int limit = 9999999;

    public Calculadora() {}

    public int suma(int x, int y) {
        int result = x + y;
        if (result < limit) return result;
        else return -1;
    }

    public int resta(int x, int y) {
        int result = x - y;
        if (result < limit) return result;
        else return -1;
    }

    public int multiplicacion(int x, int y) {
        int result = x * y;
        if (result < limit) return result;
        else return -1;
    }

    public double division(int x, int y) {
        double result = x / y;
        if (result < limit) return result;
        else return -1;
    }

}
