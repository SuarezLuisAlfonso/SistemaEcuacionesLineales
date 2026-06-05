package Sistema;

public class Sistema2x2 extends SistemaEcuaciones {
    
    public Sistema2x2(double [][] coeficientes, double [] terminosIndependientes){
        super(coeficientes, terminosIndependientes);
        if (n != 2){
            throw new IllegalArgumentException("El sistema debe ser 2x2");
        }
    }

        @Override
        public double[] resolver(){
        double factor = coeficientes[1][0] / coeficientes[0][0];
        coeficientes[1][0] = coeficientes[1][0] - coeficientes[0][0] * factor;
        coeficientes[1][1] = coeficientes[1][1] - coeficientes[0][1] * factor;
        terminosIndependientes[1] = terminosIndependientes[1] - terminosIndependientes[0] * factor;

        solucion[1] = (terminosIndependientes[1] / coeficientes[1][1]);
        solucion[0] = (terminosIndependientes[0] - coeficientes[0][1] * solucion[1]) / coeficientes[0][0];
        return solucion;
        }
    
}
