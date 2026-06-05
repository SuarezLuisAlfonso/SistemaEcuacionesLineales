package Sistema;

public class Sistemanxn extends SistemaEcuaciones {
    
    public Sistemanxn(double[][] coeficientes, double [] terminosIndependientes){
        super(coeficientes, terminosIndependientes);
    }
    
    @Override
    public double[] resolver(){
        for(int pivote = 0; pivote < n; pivote++){
            for(int fila = pivote + 1; fila < n; fila++){
                double factor = coeficientes[fila][pivote] / coeficientes[pivote][pivote];
                for (int col = 0; col < n; col++) {
                    coeficientes[fila][col] = coeficientes[fila][col] - coeficientes[pivote][col] * factor;
                }
                terminosIndependientes[fila] = terminosIndependientes[fila] - terminosIndependientes[pivote] * factor;
            }
        }
        solucion[n-1] = terminosIndependientes[n-1] / coeficientes[n-1][n-1];

        for(int i = n-2; i >=0; i--) {
        double suma = 0;
        for(int j = i+1; j < n; j++){
            suma += coeficientes[i][j] * solucion [j];
        }
        solucion[i] = (terminosIndependientes[i] - suma) / coeficientes[i][i];
    }
    return solucion;
    }
}