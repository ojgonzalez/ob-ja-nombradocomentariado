public class Main {
    public static void main(String[] args) {
        float flPotencia = Operaciones.calcularPotencia(2,-3);
        System.out.println("Potencia de 10 al cuadrado: " +  flPotencia);

        int intLogaritmo = Operaciones.calcularLogaritmo(2, 4096);
        System.out.println("Logaritmo de 8 con base 2: " + intLogaritmo);
    }
}
