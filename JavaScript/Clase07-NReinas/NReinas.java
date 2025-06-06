public class NReinas {
    final int N;

    public NReinas(int N) {
        this.N = N;
    }

    // Función principal para resolver el problema
    public void resolver() {
        int[][] tablero = new int[N][N];
        if (colocarReina(tablero, 0)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución.");
        }
    }

    // Función recursiva para colocar reinas
    private boolean colocarReina(int[][] tablero, int fila) {
        if (fila == N) return true; // Todas las reinas fueron colocadas

        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1; // Colocar reina

                if (colocarReina(tablero, fila + 1)) {
                    return true;
                }

                tablero[fila][col] = 0; // Backtrack
            }
        }

        return false; // No se puede colocar reina en esta fila
    }

    // Verifica si es seguro colocar una reina en tablero[fila][col]
    private boolean esSeguro(int[][] tablero, int fila, int col) {
        // Revisar la misma columna
        for (int i = 0; i < fila; i++)
            if (tablero[i][col] == 1) return false;

        // Revisar diagonal izquierda superior
        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (tablero[i][j] == 1) return false;

        // Revisar diagonal derecha superior
        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (tablero[i][j] == 1) return false;

        return true;
    }

    // Imprime el tablero con la solución
    private void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int val : fila) {
                System.out.print(val == 1 ? " Q " : " . ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8; // Cambia este valor para otro N
        NReinas solucion = new NReinas(n);
        solucion.resolver();
    }
}