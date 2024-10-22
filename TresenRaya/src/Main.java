import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] tabla = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

        boolean tres_en_rayaO = false;
        boolean tres_en_rayaX = false;
        int fila = 0;
        int columna = 0;

        // Imprimir la tabla inicial
        for (String[] row : tabla) {
            for (String column : row) {
                System.out.print(column + "   ");
            }
            System.out.println(); // Mover a la siguiente línea después de cada fila
        }

        // Bucle principal del juego
        for (int i = 0; i <= 9; i++) {

            // Turno del jugador 'O'
            System.out.println("Jugador 'O'. Indique la fila que quiere rellenar. ");
            fila = scanner.nextInt();
            System.out.println("Jugador 'O'. Indique la columna que quiere rellenar. ");
            columna = scanner.nextInt();
            System.out.println("Indique el símbolo 'O' para rellenar la posición. ");
            tabla[fila][columna] = scanner.next();

            // Imprimir la tabla después del movimiento
            for (String[] row : tabla) {
                for (String column : row) {
                    System.out.print(column + "   ");
                }
                System.out.println();
            }

            // Verificar si el jugador 'O' ha ganado
            if ((tabla[0][0].equals("O") && tabla[1][1].equals("O") && tabla[2][2].equals("O")) ||
                    (tabla[0][0].equals("O") && tabla[1][0].equals("O") && tabla[2][0].equals("O")) ||
                    (tabla[1][0].equals("O") && tabla[1][1].equals("O") && tabla[1][2].equals("O")) ||
                    (tabla[0][1].equals("O") && tabla[1][1].equals("O") && tabla[2][1].equals("O")) ||
                    (tabla[2][0].equals("O") && tabla[2][1].equals("O") && tabla[2][2].equals("O")) ||
                    (tabla[0][2].equals("O") && tabla[1][2].equals("O") && tabla[2][2].equals("O")) ||
                    (tabla[0][0].equals("O") && tabla[0][1].equals("O") && tabla[0][2].equals("O")) ||
                    (tabla[2][0].equals("O") && tabla[1][1].equals("O") && tabla[0][2].equals("O"))) {

                tres_en_rayaO = true;
                System.out.println("Tres en raya. Ha ganado jugador O.");
                break;
            }

            // Turno del jugador 'X'
            System.out.println("Jugador 'X'. Indique la fila que quiere rellenar. ");
            fila = scanner.nextInt();
            System.out.println("Jugador 'X'. Indique la columna que quiere rellenar. ");
            columna = scanner.nextInt();
            System.out.println("Indique el símbolo 'X' para rellenar la posición. ");
            tabla[fila][columna] = scanner.next();

            // Imprimir la tabla después del movimiento
            for (String[] row : tabla) {
                for (String column : row) {
                    System.out.print(column + "   ");
                }
                System.out.println();
            }

            // Verificar si el jugador 'X' ha ganado
            if ((tabla[0][0].equals("X") && tabla[1][1].equals("X") && tabla[2][2].equals("X")) ||
                    (tabla[0][0].equals("X") && tabla[1][0].equals("X") && tabla[2][0].equals("X")) ||
                    (tabla[1][0].equals("X") && tabla[1][1].equals("X") && tabla[1][2].equals("X")) ||
                    (tabla[0][1].equals("X") && tabla[1][1].equals("X") && tabla[2][1].equals("X")) ||
                    (tabla[2][0].equals("X") && tabla[2][1].equals("X") && tabla[2][2].equals("X")) ||
                    (tabla[0][2].equals("X") && tabla[1][2].equals("X") && tabla[2][2].equals("X")) ||
                    (tabla[0][0].equals("X") && tabla[0][1].equals("X") && tabla[0][2].equals("X")) ||
                    (tabla[2][0].equals("X") && tabla[1][1].equals("X") && tabla[0][2].equals("X"))) {
                tres_en_rayaX = true;
                System.out.println("Tres en raya. Ha ganado jugador X.");
                break;
            }
        }
    }
}
