package Sistema;

abstract class SistemaEcuaciones {

    protected int n;
    protected double [][] coeficientes;
    protected double [] terminosIndependientes;
    protected double [] solucion;


    public SistemaEcuaciones(double [][] coeficientes, double [] terminosIndependientes) {
        this.n = coeficientes.length;
        this.coeficientes = coeficientes;
        this.terminosIndependientes = terminosIndependientes;
        this.solucion = new double[n];

    }

    public abstract double[] resolver();
}
