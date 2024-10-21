package bucleFor;

public class BuscarMenorValor {
    public static void main(String[] args) {
        int[] numeros = { 5, 9, 15, 2, 4, 6 };
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            menor = Math.min(numeros[i], menor);
        }
        System.out.println("El menor valor es: " + menor);
    }
}
