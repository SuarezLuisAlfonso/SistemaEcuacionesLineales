package Sistema;

public class Main {
    public static void main(String[] args) {

        double[][] coeficientes2x2 = {
            {2, 1},
            {5, 3}
        };
        double[] terminos2x2 = {8, 2};

        Sistema2x2 sistema2 = new Sistema2x2(coeficientes2x2, terminos2x2);
        double[] solucion2 = sistema2.resolver();

        System.out.println("x = " + solucion2[0]);
        System.out.println("y = " + solucion2[1]);

        double[][] coeficientes3x3 = {
            { 2, 1, 3 },
            { 5, 3, 1 },
            { 4, 2, 7 }
        };
        double[] terminos3x3 = { 8, 2, 9 };

        Sistemanxn sistema3 = new Sistemanxn(coeficientes3x3, terminos3x3);
        double[] solucion3 = sistema3.resolver();

        for (int i = 0; i < solucion3.length; i++) {
            System.out.println("x" + (i+1) + " = " + solucion3[i]);
        }
    }
}